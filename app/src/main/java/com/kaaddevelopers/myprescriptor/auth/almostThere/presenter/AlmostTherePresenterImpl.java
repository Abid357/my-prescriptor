package com.kaaddevelopers.myprescriptor.auth.almostThere.presenter;

import android.content.Context;
import android.text.TextUtils;
import android.util.Patterns;

import com.google.firebase.auth.AuthResult;
import com.kaaddevelopers.myprescriptor.auth.almostThere.model.AlmostThereModel;
import com.kaaddevelopers.myprescriptor.auth.almostThere.view.AlmostThereView;
import com.kaaddevelopers.myprescriptor.auth.signup.view.SignupActivity;
import com.kaaddevelopers.myprescriptor.cores.User;

import org.w3c.dom.Text;

import java.util.List;
import java.util.regex.Pattern;

import javax.inject.Inject;

import io.reactivex.CompletableObserver;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function4;
import io.reactivex.functions.Function5;
import io.reactivex.functions.Function6;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.operators.observable.ObservableCollectSingle;
import io.reactivex.observers.DisposableMaybeObserver;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Abid-Temp on 03-Jan-18.
 */

public class AlmostTherePresenterImpl implements AlmostTherePresenter {

    private AlmostThereView view;
    private AlmostThereModel model;
    private DisposableObserver disposableObserver;

    @Inject
    Context context;

    @Inject
    public AlmostTherePresenterImpl(AlmostThereView view, AlmostThereModel model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void doneButtonClicked() {
        view.showLoadingDialogBox("Setting up your profile", "Hang in there!");
        model.saveUser(new User(view.getFirstName(), view.getLastName(), view.getUsername(), view.getEmail(), view.getNationality(), view.getPhone(), view.getAge()))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        view.goToHomepage();
                    }

                    @Override
                    public void onComplete() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        view.showLoadingDialogBoxError("Setting up your profile", "Oops! This username already exists! Please select another username.");
                    }
                });
    }

    @Override
    public void attachListeners() {
        Observable<CharSequence> firstNameSequence = view.attachFirstNameListener();
        Observable<CharSequence> lastNameSequence = view.attachLastNameListener();
        Observable<CharSequence> ageSequence = view.attachAgeListener();
        Observable<CharSequence> phoneSequence = view.attachPhoneListener();
        Observable<Boolean> usernameExists = attachUsernameListener();

        DisposableObserver<Boolean> booleanDisposableObserver = new DisposableObserver<Boolean>() {

            @Override
            public void onNext(Boolean aBoolean) {
                view.setDoneButtonEnabled(aBoolean);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };

        Observable.combineLatest(firstNameSequence, lastNameSequence, phoneSequence, ageSequence, usernameExists, new Function5<CharSequence, CharSequence, CharSequence, CharSequence, Boolean, Boolean>() {
            @Override
            public Boolean apply(CharSequence firstNameSequence, CharSequence lastNameSequence, CharSequence phoneSequence, CharSequence ageSequence, Boolean usernameExists) throws Exception {
                boolean formatFirstName = false, formatLastName = false, formatPhone = false, rangeAge = false;

                boolean nullFirstName = TextUtils.isEmpty(firstNameSequence);
                if (nullFirstName)
                    view.showInvalidFirstNameMessage("First name cannot be empty!");
                else {
                    formatFirstName = Pattern.compile("[a-zA-z]+").matcher(firstNameSequence).matches();
                    if (!formatFirstName)
                        view.showInvalidFirstNameMessage("First name can only contain English alphabets!");
                }

                boolean nullLastName = TextUtils.isEmpty(lastNameSequence);
                if (nullLastName)
                    view.showInvalidLastNameMessage("Last name cannot be empty!");
                else {
                    formatLastName = Pattern.compile("[a-zA-z]+").matcher(lastNameSequence).matches();
                    if (!formatLastName)
                        view.showInvalidLastNameMessage("Last name can only contain English alphabets!");
                }

                boolean nullPhone = TextUtils.isEmpty(phoneSequence);
                if (nullPhone)
                    view.showInvalidPhoneMessage("Phone cannot be empty!");
                else {
                    formatPhone = Patterns.PHONE.matcher(phoneSequence).matches();
                    if (!formatPhone)
                        view.showInvalidPhoneMessage("Invalid phone!");
                }

                boolean nullAge = TextUtils.isEmpty(ageSequence);
                if (nullAge)
                    view.showInvalidAgeMessage("Age cannot be empty!");
                else {
                    int age = Integer.parseInt(ageSequence.toString());
                    rangeAge = age < 1 || age > 200;
                    if (rangeAge)
                        view.showInvalidAgeMessage("Invalid age!");
                }

                if(usernameExists){
                    view.showInvalidUsernameMessage("Username already Exists");
                }

                return !nullFirstName && !nullLastName && !nullAge && formatFirstName && formatLastName && formatPhone && !rangeAge && !usernameExists;
            }
        }).subscribe(booleanDisposableObserver);
    }

    private Observable<Boolean> attachUsernameListener() {
        Observable<CharSequence> usernameSequence = view.attachUsernameListener();
        return usernameSequence
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .filter(new Predicate<CharSequence>() {
                    @Override
                    public boolean test(CharSequence charSequence) throws Exception {
                        if (TextUtils.isEmpty(view.getUsername())) {
                            view.showInvalidUsernameMessage("Username cannot be empty!");
                            return false;
                        }
                        if (!Pattern.compile("^[a-zA-z][^\\s]+").matcher(view.getUsername()).matches()) {
                            view.showInvalidUsernameMessage("Username must start with a letter followed by any character(s)!");
                            return false;
                        }
                        return true;
                    }
                }).concatMap(new Function<CharSequence, Observable<Boolean>>() {
            @Override
            public Observable<Boolean> apply(CharSequence charSequence) throws Exception {
                return model.checkUsernameAvailability(charSequence.toString());
            }
        });

    }
}