package com.kaaddevelopers.myprescriptor.auth.facebookLogin.view;


import com.kaaddevelopers.myprescriptor.auth.LoadingDialogBox;

import java.security.cert.LDAPCertStoreParameters;

/**
 * Created by Abid-Temp on 04-Jan-18.
 */

public interface FacebookLoginView extends LoadingDialogBox {
    void goToHomeActivity();
    void goToAlmostThereActivity();
    String getEmail();
}
