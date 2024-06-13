package com.kaaddevelopers.myprescriptor.auth.googleLogin;

import com.kaaddevelopers.myprescriptor.auth.googleLogin.model.GoogleLoginModel;
import com.kaaddevelopers.myprescriptor.auth.googleLogin.presenter.GoogleLoginPresenter;
import com.kaaddevelopers.myprescriptor.auth.googleLogin.view.GoogleLoginView;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GoogleLoginActivityModule_ProvideGoogleLoginPresenterFactory
    implements Factory<GoogleLoginPresenter> {
  private final Provider<GoogleLoginView> googleLoginViewProvider;

  private final Provider<GoogleLoginModel> googleLoginModelProvider;

  public GoogleLoginActivityModule_ProvideGoogleLoginPresenterFactory(
      Provider<GoogleLoginView> googleLoginViewProvider,
      Provider<GoogleLoginModel> googleLoginModelProvider) {
    this.googleLoginViewProvider = googleLoginViewProvider;
    this.googleLoginModelProvider = googleLoginModelProvider;
  }

  @Override
  public GoogleLoginPresenter get() {
    return Preconditions.checkNotNull(
        GoogleLoginActivityModule.provideGoogleLoginPresenter(
            googleLoginViewProvider.get(), googleLoginModelProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static GoogleLoginActivityModule_ProvideGoogleLoginPresenterFactory create(
      Provider<GoogleLoginView> googleLoginViewProvider,
      Provider<GoogleLoginModel> googleLoginModelProvider) {
    return new GoogleLoginActivityModule_ProvideGoogleLoginPresenterFactory(
        googleLoginViewProvider, googleLoginModelProvider);
  }

  public static GoogleLoginPresenter proxyProvideGoogleLoginPresenter(
      GoogleLoginView googleLoginView, GoogleLoginModel googleLoginModel) {
    return Preconditions.checkNotNull(
        GoogleLoginActivityModule.provideGoogleLoginPresenter(googleLoginView, googleLoginModel),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
