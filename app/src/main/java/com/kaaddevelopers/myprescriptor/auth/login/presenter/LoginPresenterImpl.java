package com.kaaddevelopers.myprescriptor.auth.login.presenter;

import android.text.TextUtils;

import com.google.firebase.auth.AuthResult;
import com.kaaddevelopers.myprescriptor.auth.login.model.LoginModel;
import com.kaaddevelopers.myprescriptor.auth.login.view.LoginView;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.BiFunction;
import io.reactivex.observers.DisposableMaybeObserver;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
/*
* Created by Kamil Kamili CEO of KAAD Developers on 12/30/2017.
*/

public class LoginPresenterImpl implements LoginPresenter {
    private LoginView view;
    private LoginModel model;

    @Inject
    public LoginPresenterImpl(LoginView view, LoginModel model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void loginButtonClicked() {
        view.showLoadingDialogBox("Signing you up", "Please wait!");
        model.signinUser(view.getEmail(), view.getPassword())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new DisposableMaybeObserver<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        view.goToHomeActivity();
                    }

                    @Override
                    public void onError(Throwable e) {
                        view.showLoadingDialogBoxError("Signing you up", "Oops! This email address already exists!");
                    }

                    @Override
                    public void onComplete(){
                    }
                });
    }

    @Override
    public void checkEmailAndPassword() {
        Observable<CharSequence> emailSequence = view.attachEmailListener();
        Observable<CharSequence> passwordSequence = view.attachPasswordListener();


        DisposableObserver<Boolean> booleanDisposableObserver = new DisposableObserver<Boolean>() {
            @Override
            public void onNext(Boolean aBoolean) {
                view.setLoginButtonEnabled(aBoolean);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };

        Observable.combineLatest(emailSequence, passwordSequence, new BiFunction<CharSequence, CharSequence, Boolean>() {
            @Override
            public Boolean apply(CharSequence emailSequence, CharSequence passwordSequence) throws Exception {
                boolean nullEmail = TextUtils.isEmpty(emailSequence);
                boolean formatEmail = false, lengthPassword = false;

                if (nullEmail)
                    view.showInvalidEmailMessage("Email address cannot be empty!");
                else {
                    formatEmail = android.util.Patterns.EMAIL_ADDRESS.matcher(emailSequence).matches();
                    if (!formatEmail)
                        view.showInvalidEmailMessage("Check email address format!");
                }
                boolean nullPassword = TextUtils.isEmpty(passwordSequence);

                if (nullPassword)
                    view.showInvalidPasswordMessage("Password cannot be empty!");
                else {
                    lengthPassword = passwordSequence.length() > 6;
                    if (!lengthPassword)
                        view.showInvalidPasswordMessage("Password must be more than 6 characters!");
                }
                return formatEmail && lengthPassword;
            }
        }).subscribe(booleanDisposableObserver);
    }
}
