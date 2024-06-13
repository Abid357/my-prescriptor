package com.kaaddevelopers.myprescriptor.auth.login.presenter;

import com.kaaddevelopers.myprescriptor.auth.login.model.LoginModel;
import com.kaaddevelopers.myprescriptor.auth.login.view.LoginView;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoginPresenterImpl_Factory implements Factory<LoginPresenterImpl> {
  private final Provider<LoginView> viewProvider;

  private final Provider<LoginModel> modelProvider;

  public LoginPresenterImpl_Factory(
      Provider<LoginView> viewProvider, Provider<LoginModel> modelProvider) {
    this.viewProvider = viewProvider;
    this.modelProvider = modelProvider;
  }

  @Override
  public LoginPresenterImpl get() {
    return new LoginPresenterImpl(viewProvider.get(), modelProvider.get());
  }

  public static LoginPresenterImpl_Factory create(
      Provider<LoginView> viewProvider, Provider<LoginModel> modelProvider) {
    return new LoginPresenterImpl_Factory(viewProvider, modelProvider);
  }
}
