package com.kaaddevelopers.myprescriptor.auth.facebookLogin.model;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FacebookAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import javax.inject.Inject;

import durdinapps.rxfirebase2.RxFirebaseAuth;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.annotations.NonNull;

/**
 * Created by Abid-Temp on 04-Jan-18.
 */

public class FacebookLoginModelImpl implements FacebookLoginModel {
    private FirebaseAuth auth;
    private FirebaseFirestore db;

    @Inject
    public FacebookLoginModelImpl(FirebaseAuth auth, FirebaseFirestore db) {
        this.auth = auth;
        this.db = db;
    }

    @Override
    public Maybe<AuthResult> signinUser(String idToken) {
        return RxFirebaseAuth.signInWithCredential(auth, FacebookAuthProvider.getCredential(idToken));
    }

    @Override
    public Observable<Boolean> checkEmailExists(String email) {
        return Observable.create(new ObservableOnSubscribe<Boolean>() {
            @Override
            public void subscribe(ObservableEmitter<Boolean> e) throws Exception {
                db.collection("Users")
                        .whereEqualTo("email", email)
                        .get()
                        .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                            @Override
                            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                                if (task.isSuccessful()) {
                                    if (task.getResult().isEmpty()) {
                                        e.onNext(false);
                                    } else {
                                        e.onNext(true);
                                    }
                                }
                                if (task.isComplete()) {
                                    e.onComplete();
                                }
                            }
                        });
            }
        });
    }
}

