package com.kaaddevelopers.myprescriptor.auth.signup.model;

import com.google.firebase.auth.FirebaseAuth;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SignupModelImpl_Factory implements Factory<SignupModelImpl> {
  private final Provider<FirebaseAuth> authProvider;

  public SignupModelImpl_Factory(Provider<FirebaseAuth> authProvider) {
    this.authProvider = authProvider;
  }

  @Override
  public SignupModelImpl get() {
    return new SignupModelImpl(authProvider.get());
  }

  public static SignupModelImpl_Factory create(Provider<FirebaseAuth> authProvider) {
    return new SignupModelImpl_Factory(authProvider);
  }
}
