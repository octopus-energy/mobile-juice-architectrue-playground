package com.octopus.ejplayground.di;

import com.octopus.ejplayground.ui.AndroidPlaygroundActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      SingleActivityModule_AndroidPlaygroundActivity.AndroidPlaygroundActivitySubcomponent.class
)
public abstract class SingleActivityModule_AndroidPlaygroundActivity {
  private SingleActivityModule_AndroidPlaygroundActivity() {}

  @Binds
  @IntoMap
  @ClassKey(AndroidPlaygroundActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AndroidPlaygroundActivitySubcomponent.Factory builder);

  @Subcomponent(modules = {FragmentModule.class, ActivityScopedModule.class})
  @SingleActivity
  public interface AndroidPlaygroundActivitySubcomponent
      extends AndroidInjector<AndroidPlaygroundActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AndroidPlaygroundActivity> {}
  }
}
