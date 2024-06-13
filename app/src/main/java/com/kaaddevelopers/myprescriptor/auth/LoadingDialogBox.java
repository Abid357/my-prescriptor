package com.kaaddevelopers.myprescriptor.auth;

/**
 * Created by Abid-Temp on 04-Jan-18.
 */

public interface LoadingDialogBox {
    void showLoadingDialogBox(String title, String content);
    void showLoadingDialogBoxError(String title, String content);
}
