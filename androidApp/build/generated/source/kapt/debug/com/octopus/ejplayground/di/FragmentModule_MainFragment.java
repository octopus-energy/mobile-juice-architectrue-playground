package com.octopus.ejplayground.di;

import com.octopus.ejplayground.ui.main.MainFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentModule_MainFragment.MainFragmentSubcomponent.class)
public abstract class FragmentModule_MainFragment {
  private FragmentModule_MainFragment() {}

  @Binds
  @IntoMap
  @ClassKey(MainFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MainFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface MainFragmentSubcomponent extends AndroidInjector<MainFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MainFragment> {}
  }
}
