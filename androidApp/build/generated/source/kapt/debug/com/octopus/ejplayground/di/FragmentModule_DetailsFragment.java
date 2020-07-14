package com.octopus.ejplayground.di;

import com.octopus.ejplayground.ui.DetailsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentModule_DetailsFragment.DetailsFragmentSubcomponent.class)
public abstract class FragmentModule_DetailsFragment {
  private FragmentModule_DetailsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(DetailsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DetailsFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface DetailsFragmentSubcomponent extends AndroidInjector<DetailsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<DetailsFragment> {}
  }
}
