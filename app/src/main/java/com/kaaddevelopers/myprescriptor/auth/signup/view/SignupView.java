package com.kaaddevelopers.myprescriptor.auth.signup.view;


import com.kaaddevelopers.myprescriptor.auth.LoadingDialogBox;

import io.reactivex.Observable;

/**
 * Created by Abid-Temp on 02-Jan-18.
 */

public interface SignupView extends LoadingDialogBox {
    String getEmail();
    String getPassword();
    Observable<CharSequence> attachEmailListener();
    Observable<CharSequence> attachPasswordListener();
    void showInvalidEmailMessage(String errorMessage);
    void showInvalidPasswordMessage(String errorMessage);
    void setSignupButtonEnabled(boolean isEnabled);
    void goToAlmostThereActivity();
}
