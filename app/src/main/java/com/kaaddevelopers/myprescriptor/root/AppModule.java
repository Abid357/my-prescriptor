package com.kaaddevelopers.myprescriptor.root;

import android.app.Application;
import android.content.Context;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Kamil Kamili CEO of KAAD Developers on 12/30/2017.
 */

@Module
public abstract class AppModule {
    @Binds
    abstract Context provideContext(Application application);

    @Provides
    static FirebaseAuth provideFirebaseAuth() {
        return FirebaseAuth.getInstance();
    }

    @Provides
    static FirebaseFirestore provideFirebaseFirestore(){
        return FirebaseFirestore.getInstance();
    }
}
