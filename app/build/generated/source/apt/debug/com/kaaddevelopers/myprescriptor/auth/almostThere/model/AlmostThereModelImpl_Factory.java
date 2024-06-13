package com.kaaddevelopers.myprescriptor.auth.almostThere.model;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AlmostThereModelImpl_Factory implements Factory<AlmostThereModelImpl> {
  private final Provider<FirebaseAuth> authProvider;

  private final Provider<FirebaseFirestore> dbProvider;

  public AlmostThereModelImpl_Factory(
      Provider<FirebaseAuth> authProvider, Provider<FirebaseFirestore> dbProvider) {
    this.authProvider = authProvider;
    this.dbProvider = dbProvider;
  }

  @Override
  public AlmostThereModelImpl get() {
    return new AlmostThereModelImpl(authProvider.get(), dbProvider.get());
  }

  public static AlmostThereModelImpl_Factory create(
      Provider<FirebaseAuth> authProvider, Provider<FirebaseFirestore> dbProvider) {
    return new AlmostThereModelImpl_Factory(authProvider, dbProvider);
  }
}
