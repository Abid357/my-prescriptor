package com.kaaddevelopers.myprescriptor.auth.signup.model;

import com.google.firebase.auth.AuthResult;
import com.kaaddevelopers.myprescriptor.cores.User;

import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;

/**
 * Created by Abid-Temp on 02-Jan-18.
 */

public interface SignupModel {
    Maybe<AuthResult> createUser(String emailAddress, String password);
}
