package com.kaaddevelopers.myprescriptor.auth.facebookLogin.model;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FacebookLoginModelImpl_Factory implements Factory<FacebookLoginModelImpl> {
  private final Provider<FirebaseAuth> authProvider;

  private final Provider<FirebaseFirestore> dbProvider;

  public FacebookLoginModelImpl_Factory(
      Provider<FirebaseAuth> authProvider, Provider<FirebaseFirestore> dbProvider) {
    this.authProvider = authProvider;
    this.dbProvider = dbProvider;
  }

  @Override
  public FacebookLoginModelImpl get() {
    return new FacebookLoginModelImpl(authProvider.get(), dbProvider.get());
  }

  public static FacebookLoginModelImpl_Factory create(
      Provider<FirebaseAuth> authProvider, Provider<FirebaseFirestore> dbProvider) {
    return new FacebookLoginModelImpl_Factory(authProvider, dbProvider);
  }
}
