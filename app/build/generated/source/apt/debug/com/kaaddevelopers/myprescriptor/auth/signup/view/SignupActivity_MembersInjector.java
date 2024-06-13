package com.kaaddevelopers.myprescriptor.auth.signup.view;

import android.content.Context;
import android.support.v4.app.Fragment;
import com.kaaddevelopers.myprescriptor.auth.signup.presenter.SignupPresenter;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SignupActivity_MembersInjector implements MembersInjector<SignupActivity> {
  private final Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider;

  private final Provider<DispatchingAndroidInjector<android.app.Fragment>>
      frameworkFragmentInjectorProvider;

  private final Provider<SignupPresenter> presenterProvider;

  private final Provider<Context> contextProvider;

  public SignupActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<SignupPresenter> presenterProvider,
      Provider<Context> contextProvider) {
    this.supportFragmentInjectorProvider = supportFragmentInjectorProvider;
    this.frameworkFragmentInjectorProvider = frameworkFragmentInjectorProvider;
    this.presenterProvider = presenterProvider;
    this.contextProvider = contextProvider;
  }

  public static MembersInjector<SignupActivity> create(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<SignupPresenter> presenterProvider,
      Provider<Context> contextProvider) {
    return new SignupActivity_MembersInjector(
        supportFragmentInjectorProvider,
        frameworkFragmentInjectorProvider,
        presenterProvider,
        contextProvider);
  }

  @Override
  public void injectMembers(SignupActivity instance) {
    DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
        instance, supportFragmentInjectorProvider.get());
    DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
        instance, frameworkFragmentInjectorProvider.get());
    injectPresenter(instance, presenterProvider.get());
    injectContext(instance, contextProvider.get());
  }

  public static void injectPresenter(SignupActivity instance, SignupPresenter presenter) {
    instance.presenter = presenter;
  }

  public static void injectContext(SignupActivity instance, Context context) {
    instance.context = context;
  }
}
