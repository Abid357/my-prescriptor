package com.kaaddevelopers.myprescriptor.auth.login.model;

import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import javax.inject.Inject;

import durdinapps.rxfirebase2.RxFirebaseAuth;
import io.reactivex.Maybe;

/**
 * Created by Abid-Temp on 05-Jan-18.
 */

public class LoginModelImpl implements LoginModel {
    private FirebaseAuth auth;
    private FirebaseFirestore db;

    @Inject
    public LoginModelImpl(FirebaseAuth auth, FirebaseFirestore db) {
        this.auth = auth;
        this.db = db;
    }

    @Override
    public Maybe<AuthResult> signinUser(String email, String password) {
        return RxFirebaseAuth.signInWithEmailAndPassword(auth, email, password);
    }
}
