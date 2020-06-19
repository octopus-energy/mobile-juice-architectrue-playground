package com.octopus.ejplayground.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/octopus/ejplayground/di/FragmentModule;", "", "detailsFragment", "Lcom/octopus/ejplayground/ui/details/DetailsFragment;", "mainFragment", "Lcom/octopus/ejplayground/ui/main/MainFragment;", "androidApp_debug"})
@dagger.Module()
public abstract interface FragmentModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.octopus.ejplayground.ui.main.MainFragment mainFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.octopus.ejplayground.ui.details.DetailsFragment detailsFragment();
}