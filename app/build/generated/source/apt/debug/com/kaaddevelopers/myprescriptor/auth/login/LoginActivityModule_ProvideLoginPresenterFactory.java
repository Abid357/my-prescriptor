package com.kaaddevelopers.myprescriptor.auth.login;

import com.kaaddevelopers.myprescriptor.auth.login.model.LoginModel;
import com.kaaddevelopers.myprescriptor.auth.login.presenter.LoginPresenter;
import com.kaaddevelopers.myprescriptor.auth.login.view.LoginView;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoginActivityModule_ProvideLoginPresenterFactory
    implements Factory<LoginPresenter> {
  private final Provider<LoginView> loginViewProvider;

  private final Provider<LoginModel> loginModelProvider;

  public LoginActivityModule_ProvideLoginPresenterFactory(
      Provider<LoginView> loginViewProvider, Provider<LoginModel> loginModelProvider) {
    this.loginViewProvider = loginViewProvider;
    this.loginModelProvider = loginModelProvider;
  }

  @Override
  public LoginPresenter get() {
    return Preconditions.checkNotNull(
        LoginActivityModule.provideLoginPresenter(
            loginViewProvider.get(), loginModelProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static LoginActivityModule_ProvideLoginPresenterFactory create(
      Provider<LoginView> loginViewProvider, Provider<LoginModel> loginModelProvider) {
    return new LoginActivityModule_ProvideLoginPresenterFactory(
        loginViewProvider, loginModelProvider);
  }

  public static LoginPresenter proxyProvideLoginPresenter(
      LoginView loginView, LoginModel loginModel) {
    return Preconditions.checkNotNull(
        LoginActivityModule.provideLoginPresenter(loginView, loginModel),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
