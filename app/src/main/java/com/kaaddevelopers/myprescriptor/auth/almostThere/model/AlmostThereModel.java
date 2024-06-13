package com.kaaddevelopers.myprescriptor.auth.almostThere.model;

import com.google.firebase.auth.AuthResult;
import com.kaaddevelopers.myprescriptor.cores.User;

import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.internal.operators.observable.ObservableSerialized;

/**
 * Created by Abid-Temp on 03-Jan-18.
 */

public interface AlmostThereModel {
    Observable<Boolean> checkUsernameAvailability(String username);
    Completable saveUser(User user);
}
