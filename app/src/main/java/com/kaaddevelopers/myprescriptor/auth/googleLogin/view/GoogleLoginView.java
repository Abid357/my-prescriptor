package com.kaaddevelopers.myprescriptor.auth.googleLogin.view;


import com.kaaddevelopers.myprescriptor.auth.LoadingDialogBox;

/**
 * Created by Abid-Temp on 03-Jan-18.
 */

public interface GoogleLoginView extends LoadingDialogBox {
    void goToHomeActivity();
    void goToAlmostThereActivity();
    String getEmail();
}
