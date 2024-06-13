package com.kaaddevelopers.myprescriptor.auth.signup.presenter;

import com.kaaddevelopers.myprescriptor.auth.signup.model.SignupModel;
import com.kaaddevelopers.myprescriptor.auth.signup.view.SignupView;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SignupPresenterImpl_Factory implements Factory<SignupPresenterImpl> {
  private final Provider<SignupView> viewProvider;

  private final Provider<SignupModel> modelProvider;

  public SignupPresenterImpl_Factory(
      Provider<SignupView> viewProvider, Provider<SignupModel> modelProvider) {
    this.viewProvider = viewProvider;
    this.modelProvider = modelProvider;
  }

  @Override
  public SignupPresenterImpl get() {
    return new SignupPresenterImpl(viewProvider.get(), modelProvider.get());
  }

  public static SignupPresenterImpl_Factory create(
      Provider<SignupView> viewProvider, Provider<SignupModel> modelProvider) {
    return new SignupPresenterImpl_Factory(viewProvider, modelProvider);
  }
}
