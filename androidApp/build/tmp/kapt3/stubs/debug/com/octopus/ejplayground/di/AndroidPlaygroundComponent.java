package com.octopus.ejplayground.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/octopus/ejplayground/di/AndroidPlaygroundComponent;", "Ldagger/android/AndroidInjector;", "Lcom/octopus/ejplayground/App;", "Builder", "androidApp_debug"})
@dagger.Component(modules = {dagger.android.AndroidInjectionModule.class, dagger.android.support.AndroidSupportInjectionModule.class, com.octopus.ejplayground.di.SingleActivityModule.class})
public abstract interface AndroidPlaygroundComponent extends dagger.android.AndroidInjector<com.octopus.ejplayground.App> {
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/octopus/ejplayground/di/AndroidPlaygroundComponent$Builder;", "", "build", "Lcom/octopus/ejplayground/di/AndroidPlaygroundComponent;", "androidApp_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.octopus.ejplayground.di.AndroidPlaygroundComponent build();
    }
}