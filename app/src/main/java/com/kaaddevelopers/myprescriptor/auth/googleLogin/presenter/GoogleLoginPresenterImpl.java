package com.kaaddevelopers.myprescriptor.auth.googleLogin.presenter;

import android.content.SharedPreferences;
import android.util.Log;

import com.google.firebase.auth.AuthResult;
import com.kaaddevelopers.myprescriptor.auth.googleLogin.model.GoogleLoginModel;
import com.kaaddevelopers.myprescriptor.auth.googleLogin.view.GoogleLoginView;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableMaybeObserver;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Abid-Temp on 03-Jan-18.
 */

public class GoogleLoginPresenterImpl implements GoogleLoginPresenter {
    private GoogleLoginView view;
    private GoogleLoginModel model;
    private DisposableObserver<Boolean> observer;

    @Inject
    public GoogleLoginPresenterImpl(GoogleLoginView view, GoogleLoginModel model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void signinUser(String idToken) {
        view.showLoadingDialogBox("Contacting My Prescriptor", "Please wait while we contact the server...");
        // observer subscribed to an observable that checks if user already exists in Firebase
        observer = new DisposableObserver<Boolean>() {
            @Override
            public void onNext(Boolean aBoolean) {
                if (aBoolean)
                    view.goToHomeActivity();
                else {
                    model.signinUser(idToken)
                            .subscribeOn(Schedulers.io())
                            .observeOn(AndroidSchedulers.mainThread())
                            .subscribe(new DisposableMaybeObserver<AuthResult>() {
                                @Override
                                public void onSuccess(AuthResult authResult) {
                                    view.goToAlmostThereActivity();
                                }

                                @Override
                                public void onError(Throwable e) {
                                    view.showLoadingDialogBoxError("Contacting My Prescriptor", "Sorry! We could not connect you to the server.");
                                }

                                @Override
                                public void onComplete() {
                                }
                            });
                }
                model.checkEmailExists(view.getEmail())
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(observer);
            }

            @Override
            public void onError(Throwable e) {
                view.showLoadingDialogBoxError("Contacting My Prescriptor", "Sorry! We could not connect you to the server.");
            }

            @Override
            public void onComplete() {

            }
        };
    }
}

