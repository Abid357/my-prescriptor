package com.kaaddevelopers.myprescriptor.auth.facebookLogin.view;

import android.content.Context;
import android.support.v4.app.Fragment;
import com.kaaddevelopers.myprescriptor.auth.facebookLogin.presenter.FacebookLoginPresenter;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FacebookLoginActivity_MembersInjector
    implements MembersInjector<FacebookLoginActivity> {
  private final Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider;

  private final Provider<DispatchingAndroidInjector<android.app.Fragment>>
      frameworkFragmentInjectorProvider;

  private final Provider<FacebookLoginPresenter> presenterProvider;

  private final Provider<Context> contextProvider;

  public FacebookLoginActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<FacebookLoginPresenter> presenterProvider,
      Provider<Context> contextProvider) {
    this.supportFragmentInjectorProvider = supportFragmentInjectorProvider;
    this.frameworkFragmentInjectorProvider = frameworkFragmentInjectorProvider;
    this.presenterProvider = presenterProvider;
    this.contextProvider = contextProvider;
  }

  public static MembersInjector<FacebookLoginActivity> create(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<FacebookLoginPresenter> presenterProvider,
      Provider<Context> contextProvider) {
    return new FacebookLoginActivity_MembersInjector(
        supportFragmentInjectorProvider,
        frameworkFragmentInjectorProvider,
        presenterProvider,
        contextProvider);
  }

  @Override
  public void injectMembers(FacebookLoginActivity instance) {
    DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
        instance, supportFragmentInjectorProvider.get());
    DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
        instance, frameworkFragmentInjectorProvider.get());
    injectPresenter(instance, presenterProvider.get());
    injectContext(instance, contextProvider.get());
  }

  public static void injectPresenter(
      FacebookLoginActivity instance, FacebookLoginPresenter presenter) {
    instance.presenter = presenter;
  }

  public static void injectContext(FacebookLoginActivity instance, Context context) {
    instance.context = context;
  }
}
