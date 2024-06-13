package com.kaaddevelopers.myprescriptor.auth.almostThere.view;

import android.content.Context;
import android.support.v4.app.Fragment;
import com.kaaddevelopers.myprescriptor.auth.almostThere.presenter.AlmostTherePresenter;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AlmostThereActivity_MembersInjector
    implements MembersInjector<AlmostThereActivity> {
  private final Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider;

  private final Provider<DispatchingAndroidInjector<android.app.Fragment>>
      frameworkFragmentInjectorProvider;

  private final Provider<AlmostTherePresenter> presenterProvider;

  private final Provider<Context> contextProvider;

  public AlmostThereActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<AlmostTherePresenter> presenterProvider,
      Provider<Context> contextProvider) {
    this.supportFragmentInjectorProvider = supportFragmentInjectorProvider;
    this.frameworkFragmentInjectorProvider = frameworkFragmentInjectorProvider;
    this.presenterProvider = presenterProvider;
    this.contextProvider = contextProvider;
  }

  public static MembersInjector<AlmostThereActivity> create(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<AlmostTherePresenter> presenterProvider,
      Provider<Context> contextProvider) {
    return new AlmostThereActivity_MembersInjector(
        supportFragmentInjectorProvider,
        frameworkFragmentInjectorProvider,
        presenterProvider,
        contextProvider);
  }

  @Override
  public void injectMembers(AlmostThereActivity instance) {
    DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
        instance, supportFragmentInjectorProvider.get());
    DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
        instance, frameworkFragmentInjectorProvider.get());
    injectPresenter(instance, presenterProvider.get());
    injectContext(instance, contextProvider.get());
  }

  public static void injectPresenter(AlmostThereActivity instance, AlmostTherePresenter presenter) {
    instance.presenter = presenter;
  }

  public static void injectContext(AlmostThereActivity instance, Context context) {
    instance.context = context;
  }
}
