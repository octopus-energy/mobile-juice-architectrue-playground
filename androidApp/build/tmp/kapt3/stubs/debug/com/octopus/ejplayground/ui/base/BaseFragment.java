package com.octopus.ejplayground.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lcom/octopus/ejplayground/ui/base/BaseFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "coreroutineSupervisor", "Lkotlinx/coroutines/CompletableJob;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "setCoroutineScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "getLifecycleReceivers", "", "Lcom/octopus/ejplayground/ui/base/LifecycleReceiver;", "onStart", "", "onStop", "androidApp_debug"})
public abstract class BaseFragment extends dagger.android.support.DaggerFragment {
    private kotlinx.coroutines.CompletableJob coreroutineSupervisor;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.CoroutineScope coroutineScope;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected final kotlinx.coroutines.CoroutineScope getCoroutineScope() {
        return null;
    }
    
    protected final void setCoroutineScope(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.octopus.ejplayground.ui.base.LifecycleReceiver> getLifecycleReceivers();
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    public BaseFragment() {
        super();
    }
}