package com.kaaddevelopers.myprescriptor.auth.almostThere.model;

import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QuerySnapshot;
import com.kaaddevelopers.myprescriptor.cores.User;

import javax.inject.Inject;

import durdinapps.rxfirebase2.RxFirebaseQuery;
import durdinapps.rxfirebase2.RxFirestore;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;

/**
 * Created by Abid-Temp on 03-Jan-18.
 */

public class AlmostThereModelImpl implements AlmostThereModel {

    private FirebaseAuth auth;
    private FirebaseFirestore db;

    @Inject
    public AlmostThereModelImpl(FirebaseAuth auth, FirebaseFirestore db) {
        this.auth = auth;
        this.db = db;
    }

    @Override
    public Observable<Boolean> checkUsernameAvailability(String username) {
        return Observable.create(new ObservableOnSubscribe<Boolean>() {
            @Override
            public void subscribe(ObservableEmitter<Boolean> e) throws Exception {
                db.collection("Users")
                        .whereEqualTo("username", username)
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


    @Override
    public Completable saveUser(User user) {
        return RxFirestore.setDocument(db.collection("Users").document(), user.getMap());
    }
}
