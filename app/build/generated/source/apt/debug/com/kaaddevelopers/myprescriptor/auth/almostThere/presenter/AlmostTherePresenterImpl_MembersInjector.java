package com.kaaddevelopers.myprescriptor.auth.almostThere.presenter;

import android.content.Context;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AlmostTherePresenterImpl_MembersInjector
    implements MembersInjector<AlmostTherePresenterImpl> {
  private final Provider<Context> contextProvider;

  public AlmostTherePresenterImpl_MembersInjector(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  public static MembersInjector<AlmostTherePresenterImpl> create(
      Provider<Context> contextProvider) {
    return new AlmostTherePresenterImpl_MembersInjector(contextProvider);
  }

  @Override
  public void injectMembers(AlmostTherePresenterImpl instance) {
    injectContext(instance, contextProvider.get());
  }

  public static void injectContext(AlmostTherePresenterImpl instance, Context context) {
    instance.context = context;
  }
}
