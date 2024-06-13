package com.kaaddevelopers.myprescriptor.auth.almostThere.view;

import android.content.SharedPreferences;


import com.kaaddevelopers.myprescriptor.auth.LoadingDialogBox;

import io.reactivex.Observable;

/**
 * Created by Abid-Temp on 03-Jan-18.
 */

public interface AlmostThereView extends LoadingDialogBox {
    String getUsername();
    String getFirstName();
    String getLastName();
    String getEmail();
    String getNationality();
    String getPhone();
    int getAge();
    Observable<CharSequence> attachUsernameListener();
    Observable<CharSequence> attachFirstNameListener();
    Observable<CharSequence> attachLastNameListener();
    Observable<CharSequence> attachAgeListener();
    Observable<CharSequence> attachPhoneListener();
    void showInvalidUsernameMessage(String errorMessage);
    void showInvalidFirstNameMessage(String errorMessage);
    void showInvalidLastNameMessage(String errorMessage);
    void showInvalidPhoneMessage(String errorMessage);
    void showInvalidAgeMessage(String errorMessage);
    void setDoneButtonEnabled(boolean isEnabled);
    void goToHomepage();
}
