package com.kaaddevelopers.myprescriptor.auth.googleLogin.view;

import android.content.Context;
import android.support.v4.app.Fragment;
import com.kaaddevelopers.myprescriptor.auth.googleLogin.presenter.GoogleLoginPresenter;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GoogleLoginActivity_MembersInjector
    implements MembersInjector<GoogleLoginActivity> {
  private final Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider;

  private final Provider<DispatchingAndroidInjector<android.app.Fragment>>
      frameworkFragmentInjectorProvider;

  private final Provider<GoogleLoginPresenter> presenterProvider;

  private final Provider<Context> contextProvider;

  public GoogleLoginActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<GoogleLoginPresenter> presenterProvider,
      Provider<Context> contextProvider) {
    this.supportFragmentInjectorProvider = supportFragmentInjectorProvider;
    this.frameworkFragmentInjectorProvider = frameworkFragmentInjectorProvider;
    this.presenterProvider = presenterProvider;
    this.contextProvider = contextProvider;
  }

  public static MembersInjector<GoogleLoginActivity> create(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<GoogleLoginPresenter> presenterProvider,
      Provider<Context> contextProvider) {
    return new GoogleLoginActivity_MembersInjector(
        supportFragmentInjectorProvider,
        frameworkFragmentInjectorProvider,
        presenterProvider,
        contextProvider);
  }

  @Override
  public void injectMembers(GoogleLoginActivity instance) {
    DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
        instance, supportFragmentInjectorProvider.get());
    DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
        instance, frameworkFragmentInjectorProvider.get());
    injectPresenter(instance, presenterProvider.get());
    injectContext(instance, contextProvider.get());
  }

  public static void injectPresenter(GoogleLoginActivity instance, GoogleLoginPresenter presenter) {
    instance.presenter = presenter;
  }

  public static void injectContext(GoogleLoginActivity instance, Context context) {
    instance.context = context;
  }
}
