package com.kaaddevelopers.myprescriptor.auth.facebookLogin.model;

import com.google.firebase.auth.AuthResult;

import io.reactivex.Maybe;
import io.reactivex.Observable;

/**
 * Created by Abid-Temp on 04-Jan-18.
 */

public interface FacebookLoginModel {
    Maybe<AuthResult> signinUser(String idToken);
    Observable<Boolean> checkEmailExists(String email);
}
