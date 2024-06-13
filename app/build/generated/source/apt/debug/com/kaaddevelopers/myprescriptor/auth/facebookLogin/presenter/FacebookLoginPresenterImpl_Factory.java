package com.kaaddevelopers.myprescriptor.auth.facebookLogin.presenter;

import com.kaaddevelopers.myprescriptor.auth.facebookLogin.model.FacebookLoginModel;
import com.kaaddevelopers.myprescriptor.auth.facebookLogin.view.FacebookLoginView;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FacebookLoginPresenterImpl_Factory
    implements Factory<FacebookLoginPresenterImpl> {
  private final Provider<FacebookLoginView> viewProvider;

  private final Provider<FacebookLoginModel> modelProvider;

  public FacebookLoginPresenterImpl_Factory(
      Provider<FacebookLoginView> viewProvider, Provider<FacebookLoginModel> modelProvider) {
    this.viewProvider = viewProvider;
    this.modelProvider = modelProvider;
  }

  @Override
  public FacebookLoginPresenterImpl get() {
    return new FacebookLoginPresenterImpl(viewProvider.get(), modelProvider.get());
  }

  public static FacebookLoginPresenterImpl_Factory create(
      Provider<FacebookLoginView> viewProvider, Provider<FacebookLoginModel> modelProvider) {
    return new FacebookLoginPresenterImpl_Factory(viewProvider, modelProvider);
  }
}
