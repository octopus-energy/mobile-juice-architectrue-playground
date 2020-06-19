// Generated by Dagger (https://dagger.dev).
package com.octopus.ejplayground.ui.main;

import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainFragment_MembersInjector implements MembersInjector<MainFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<MainViewModel> mainViewModelProvider;

  public MainFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<MainViewModel> mainViewModelProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.mainViewModelProvider = mainViewModelProvider;
  }

  public static MembersInjector<MainFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<MainViewModel> mainViewModelProvider) {
    return new MainFragment_MembersInjector(androidInjectorProvider, mainViewModelProvider);}

  @Override
  public void injectMembers(MainFragment instance) {
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectMainViewModel(instance, mainViewModelProvider.get());
  }

  @InjectedFieldSignature("com.octopus.ejplayground.ui.main.MainFragment.mainViewModel")
  public static void injectMainViewModel(MainFragment instance, MainViewModel mainViewModel) {
    instance.mainViewModel = mainViewModel;
  }
}
