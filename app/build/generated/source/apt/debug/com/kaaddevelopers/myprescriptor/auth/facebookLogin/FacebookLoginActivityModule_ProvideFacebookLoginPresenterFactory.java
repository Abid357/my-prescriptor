package com.kaaddevelopers.myprescriptor.auth.facebookLogin;

import com.kaaddevelopers.myprescriptor.auth.facebookLogin.model.FacebookLoginModel;
import com.kaaddevelopers.myprescriptor.auth.facebookLogin.presenter.FacebookLoginPresenter;
import com.kaaddevelopers.myprescriptor.auth.facebookLogin.view.FacebookLoginView;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FacebookLoginActivityModule_ProvideFacebookLoginPresenterFactory
    implements Factory<FacebookLoginPresenter> {
  private final Provider<FacebookLoginView> facebookLoginViewProvider;

  private final Provider<FacebookLoginModel> facebookLoginsignupModelProvider;

  public FacebookLoginActivityModule_ProvideFacebookLoginPresenterFactory(
      Provider<FacebookLoginView> facebookLoginViewProvider,
      Provider<FacebookLoginModel> facebookLoginsignupModelProvider) {
    this.facebookLoginViewProvider = facebookLoginViewProvider;
    this.facebookLoginsignupModelProvider = facebookLoginsignupModelProvider;
  }

  @Override
  public FacebookLoginPresenter get() {
    return Preconditions.checkNotNull(
        FacebookLoginActivityModule.provideFacebookLoginPresenter(
            facebookLoginViewProvider.get(), facebookLoginsignupModelProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static FacebookLoginActivityModule_ProvideFacebookLoginPresenterFactory create(
      Provider<FacebookLoginView> facebookLoginViewProvider,
      Provider<FacebookLoginModel> facebookLoginsignupModelProvider) {
    return new FacebookLoginActivityModule_ProvideFacebookLoginPresenterFactory(
        facebookLoginViewProvider, facebookLoginsignupModelProvider);
  }

  public static FacebookLoginPresenter proxyProvideFacebookLoginPresenter(
      FacebookLoginView facebookLoginView, FacebookLoginModel facebookLoginsignupModel) {
    return Preconditions.checkNotNull(
        FacebookLoginActivityModule.provideFacebookLoginPresenter(
            facebookLoginView, facebookLoginsignupModel),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
