package com.kaaddevelopers.myprescriptor.root;

import com.google.firebase.auth.FirebaseAuth;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideFirebaseAuthFactory implements Factory<FirebaseAuth> {
  private static final AppModule_ProvideFirebaseAuthFactory INSTANCE =
      new AppModule_ProvideFirebaseAuthFactory();

  @Override
  public FirebaseAuth get() {
    return Preconditions.checkNotNull(
        AppModule.provideFirebaseAuth(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_ProvideFirebaseAuthFactory create() {
    return INSTANCE;
  }

  public static FirebaseAuth proxyProvideFirebaseAuth() {
    return Preconditions.checkNotNull(
        AppModule.provideFirebaseAuth(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
