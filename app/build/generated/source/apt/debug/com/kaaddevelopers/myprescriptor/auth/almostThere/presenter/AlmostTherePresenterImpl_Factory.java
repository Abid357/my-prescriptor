package com.kaaddevelopers.myprescriptor.auth.almostThere.presenter;

import android.content.Context;
import com.kaaddevelopers.myprescriptor.auth.almostThere.model.AlmostThereModel;
import com.kaaddevelopers.myprescriptor.auth.almostThere.view.AlmostThereView;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AlmostTherePresenterImpl_Factory implements Factory<AlmostTherePresenterImpl> {
  private final Provider<AlmostThereView> viewProvider;

  private final Provider<AlmostThereModel> modelProvider;

  private final Provider<Context> contextProvider;

  public AlmostTherePresenterImpl_Factory(
      Provider<AlmostThereView> viewProvider,
      Provider<AlmostThereModel> modelProvider,
      Provider<Context> contextProvider) {
    this.viewProvider = viewProvider;
    this.modelProvider = modelProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public AlmostTherePresenterImpl get() {
    AlmostTherePresenterImpl instance =
        new AlmostTherePresenterImpl(viewProvider.get(), modelProvider.get());
    AlmostTherePresenterImpl_MembersInjector.injectContext(instance, contextProvider.get());
    return instance;
  }

  public static AlmostTherePresenterImpl_Factory create(
      Provider<AlmostThereView> viewProvider,
      Provider<AlmostThereModel> modelProvider,
      Provider<Context> contextProvider) {
    return new AlmostTherePresenterImpl_Factory(viewProvider, modelProvider, contextProvider);
  }

  public static AlmostTherePresenterImpl newAlmostTherePresenterImpl(
      AlmostThereView view, AlmostThereModel model) {
    return new AlmostTherePresenterImpl(view, model);
  }
}
