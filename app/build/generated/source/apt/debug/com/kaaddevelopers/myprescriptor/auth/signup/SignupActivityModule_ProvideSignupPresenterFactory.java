package com.kaaddevelopers.myprescriptor.auth.signup;

import com.kaaddevelopers.myprescriptor.auth.signup.model.SignupModel;
import com.kaaddevelopers.myprescriptor.auth.signup.presenter.SignupPresenter;
import com.kaaddevelopers.myprescriptor.auth.signup.view.SignupView;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SignupActivityModule_ProvideSignupPresenterFactory
    implements Factory<SignupPresenter> {
  private final Provider<SignupView> signupViewProvider;

  private final Provider<SignupModel> signupModelProvider;

  public SignupActivityModule_ProvideSignupPresenterFactory(
      Provider<SignupView> signupViewProvider, Provider<SignupModel> signupModelProvider) {
    this.signupViewProvider = signupViewProvider;
    this.signupModelProvider = signupModelProvider;
  }

  @Override
  public SignupPresenter get() {
    return Preconditions.checkNotNull(
        SignupActivityModule.provideSignupPresenter(
            signupViewProvider.get(), signupModelProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static SignupActivityModule_ProvideSignupPresenterFactory create(
      Provider<SignupView> signupViewProvider, Provider<SignupModel> signupModelProvider) {
    return new SignupActivityModule_ProvideSignupPresenterFactory(
        signupViewProvider, signupModelProvider);
  }

  public static SignupPresenter proxyProvideSignupPresenter(
      SignupView signupView, SignupModel signupModel) {
    return Preconditions.checkNotNull(
        SignupActivityModule.provideSignupPresenter(signupView, signupModel),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
