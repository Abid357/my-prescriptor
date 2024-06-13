package com.kaaddevelopers.myprescriptor.auth.login.model;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoginModelImpl_Factory implements Factory<LoginModelImpl> {
  private final Provider<FirebaseAuth> authProvider;

  private final Provider<FirebaseFirestore> dbProvider;

  public LoginModelImpl_Factory(
      Provider<FirebaseAuth> authProvider, Provider<FirebaseFirestore> dbProvider) {
    this.authProvider = authProvider;
    this.dbProvider = dbProvider;
  }

  @Override
  public LoginModelImpl get() {
    return new LoginModelImpl(authProvider.get(), dbProvider.get());
  }

  public static LoginModelImpl_Factory create(
      Provider<FirebaseAuth> authProvider, Provider<FirebaseFirestore> dbProvider) {
    return new LoginModelImpl_Factory(authProvider, dbProvider);
  }
}
