package com.kaaddevelopers.myprescriptor.auth.googleLogin.model;

import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;

import io.reactivex.Maybe;
import io.reactivex.Observable;

/**
 * Created by Abid-Temp on 03-Jan-18.
 */

public interface GoogleLoginModel {
    Maybe<AuthResult> signinUser(String idToken);
    Observable<Boolean> checkEmailExists(String username);
}
