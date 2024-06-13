package com.kaaddevelopers.myprescriptor.auth.login.view;

import com.kaaddevelopers.myprescriptor.auth.LoadingDialogBox;

import io.reactivex.Observable;

/**
 * Created by Kamil Kamili CEO of KAAD Developers on 12/30/2017.
 */

public interface LoginView extends LoadingDialogBox{
    String getEmail();
    String getPassword();
    Observable<CharSequence> attachEmailListener();
    Observable<CharSequence> attachPasswordListener();
    void showInvalidEmailMessage(String errorMessage);
    void showInvalidPasswordMessage(String errorMessage);
    void setLoginButtonEnabled(boolean isEnabled);
    void goToHomeActivity();
}