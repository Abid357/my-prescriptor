package com.kaaddevelopers.myprescriptor.auth.login.view;

import android.content.Context;
import android.support.v4.app.Fragment;
import com.kaaddevelopers.myprescriptor.auth.login.presenter.LoginPresenter;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoginActivity_MembersInjector implements MembersInjector<LoginActivity> {
  private final Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider;

  private final Provider<DispatchingAndroidInjector<android.app.Fragment>>
      frameworkFragmentInjectorProvider;

  private final Provider<LoginPresenter> presenterProvider;

  private final Provider<Context> contextProvider;

  public LoginActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<LoginPresenter> presenterProvider,
      Provider<Context> contextProvider) {
    this.supportFragmentInjectorProvider = supportFragmentInjectorProvider;
    this.frameworkFragmentInjectorProvider = frameworkFragmentInjectorProvider;
    this.presenterProvider = presenterProvider;
    this.contextProvider = contextProvider;
  }

  public static MembersInjector<LoginActivity> create(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<LoginPresenter> presenterProvider,
      Provider<Context> contextProvider) {
    return new LoginActivity_MembersInjector(
        supportFragmentInjectorProvider,
        frameworkFragmentInjectorProvider,
        presenterProvider,
        contextProvider);
  }

  @Override
  public void injectMembers(LoginActivity instance) {
    DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
        instance, supportFragmentInjectorProvider.get());
    DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
        instance, frameworkFragmentInjectorProvider.get());
    injectPresenter(instance, presenterProvider.get());
    injectContext(instance, contextProvider.get());
  }

  public static void injectPresenter(LoginActivity instance, LoginPresenter presenter) {
    instance.presenter = presenter;
  }

  public static void injectContext(LoginActivity instance, Context context) {
    instance.context = context;
  }
}
