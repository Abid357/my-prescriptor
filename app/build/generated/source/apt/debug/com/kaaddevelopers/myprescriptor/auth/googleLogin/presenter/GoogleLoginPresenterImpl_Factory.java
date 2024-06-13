package com.kaaddevelopers.myprescriptor.auth.googleLogin.presenter;

import com.kaaddevelopers.myprescriptor.auth.googleLogin.model.GoogleLoginModel;
import com.kaaddevelopers.myprescriptor.auth.googleLogin.view.GoogleLoginView;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GoogleLoginPresenterImpl_Factory implements Factory<GoogleLoginPresenterImpl> {
  private final Provider<GoogleLoginView> viewProvider;

  private final Provider<GoogleLoginModel> modelProvider;

  public GoogleLoginPresenterImpl_Factory(
      Provider<GoogleLoginView> viewProvider, Provider<GoogleLoginModel> modelProvider) {
    this.viewProvider = viewProvider;
    this.modelProvider = modelProvider;
  }

  @Override
  public GoogleLoginPresenterImpl get() {
    return new GoogleLoginPresenterImpl(viewProvider.get(), modelProvider.get());
  }

  public static GoogleLoginPresenterImpl_Factory create(
      Provider<GoogleLoginView> viewProvider, Provider<GoogleLoginModel> modelProvider) {
    return new GoogleLoginPresenterImpl_Factory(viewProvider, modelProvider);
  }
}
