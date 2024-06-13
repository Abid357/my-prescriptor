package com.kaaddevelopers.myprescriptor.auth.googleLogin.model;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GoogleLoginModelImpl_Factory implements Factory<GoogleLoginModelImpl> {
  private final Provider<FirebaseAuth> authProvider;

  private final Provider<FirebaseFirestore> dbProvider;

  public GoogleLoginModelImpl_Factory(
      Provider<FirebaseAuth> authProvider, Provider<FirebaseFirestore> dbProvider) {
    this.authProvider = authProvider;
    this.dbProvider = dbProvider;
  }

  @Override
  public GoogleLoginModelImpl get() {
    return new GoogleLoginModelImpl(authProvider.get(), dbProvider.get());
  }

  public static GoogleLoginModelImpl_Factory create(
      Provider<FirebaseAuth> authProvider, Provider<FirebaseFirestore> dbProvider) {
    return new GoogleLoginModelImpl_Factory(authProvider, dbProvider);
  }
}
