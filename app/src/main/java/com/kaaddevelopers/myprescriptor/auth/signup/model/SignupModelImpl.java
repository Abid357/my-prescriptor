package com.kaaddevelopers.myprescriptor.auth.signup.model;

import android.support.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;
import com.kaaddevelopers.myprescriptor.cores.User;

import javax.inject.Inject;

import durdinapps.rxfirebase2.RxFirebaseAuth;
import durdinapps.rxfirebase2.RxFirestore;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/**
 * Created by Abid-Temp on 02-Jan-18.
 */

public class SignupModelImpl implements SignupModel {

    private FirebaseAuth auth;

    @Inject
    public SignupModelImpl(FirebaseAuth auth) {
        this.auth = auth;
    }

    @Override
    public Maybe<AuthResult> createUser(String emailAddress, String password) {
        return RxFirebaseAuth.createUserWithEmailAndPassword(auth, emailAddress, password);
    }
}
