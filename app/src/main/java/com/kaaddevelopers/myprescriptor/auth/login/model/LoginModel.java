package com.kaaddevelopers.myprescriptor.auth.login.model;

import com.google.firebase.auth.AuthResult;
import com.kaaddevelopers.myprescriptor.cores.User;

import io.reactivex.Maybe;

/**
 * Created by Kamil Kamili CEO of KAAD Developers on 12/30/2017.
 */

public interface LoginModel {
    Maybe<AuthResult> signinUser(String email, String password);
}
