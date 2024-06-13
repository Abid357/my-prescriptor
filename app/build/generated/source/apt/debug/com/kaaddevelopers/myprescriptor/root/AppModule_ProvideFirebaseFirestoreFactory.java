package com.kaaddevelopers.myprescriptor.root;

import com.google.firebase.firestore.FirebaseFirestore;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideFirebaseFirestoreFactory implements Factory<FirebaseFirestore> {
  private static final AppModule_ProvideFirebaseFirestoreFactory INSTANCE =
      new AppModule_ProvideFirebaseFirestoreFactory();

  @Override
  public FirebaseFirestore get() {
    return Preconditions.checkNotNull(
        AppModule.provideFirebaseFirestore(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_ProvideFirebaseFirestoreFactory create() {
    return INSTANCE;
  }

  public static FirebaseFirestore proxyProvideFirebaseFirestore() {
    return Preconditions.checkNotNull(
        AppModule.provideFirebaseFirestore(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
