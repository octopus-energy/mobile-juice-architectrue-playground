package com.octopus.ejplayground.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u0000H\u0004\u00a2\u0006\u0002\u0010\u0011J\b\u0010\u0017\u001a\u00020\u0015H\u0017J\b\u0010\u0018\u001a\u00020\u0015H\u0017J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u00028\u0000X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/octopus/ejplayground/ui/base/BaseViewModel;", "T", "Lcom/octopus/ejplayground/ui/base/BaseViewState;", "Lcom/octopus/ejplayground/ui/base/LifecycleReceiver;", "()V", "coreroutineSupervisor", "Lkotlinx/coroutines/CompletableJob;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "setCoroutineScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "lastViewState", "getLastViewState", "()Lcom/octopus/ejplayground/ui/base/BaseViewState;", "setLastViewState", "(Lcom/octopus/ejplayground/ui/base/BaseViewState;)V", "viewStatePublisher", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;", "emit", "", "viewState", "onAttach", "onDetach", "viewStateStream", "Lkotlinx/coroutines/flow/Flow;", "androidApp_debug"})
public abstract class BaseViewModel<T extends com.octopus.ejplayground.ui.base.BaseViewState> implements com.octopus.ejplayground.ui.base.LifecycleReceiver {
    private final kotlinx.coroutines.channels.ConflatedBroadcastChannel<T> viewStatePublisher = null;
    private kotlinx.coroutines.CompletableJob coreroutineSupervisor;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.CoroutineScope coroutineScope;
    
    @org.jetbrains.annotations.NotNull()
    public abstract T getLastViewState();
    
    public abstract void setLastViewState(@org.jetbrains.annotations.NotNull()
    T p0);
    
    @org.jetbrains.annotations.NotNull()
    protected final kotlinx.coroutines.CoroutineScope getCoroutineScope() {
        return null;
    }
    
    protected final void setCoroutineScope(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope p0) {
    }
    
    @androidx.annotation.CallSuper()
    @java.lang.Override()
    public void onAttach() {
    }
    
    @androidx.annotation.CallSuper()
    @java.lang.Override()
    public void onDetach() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<T> viewStateStream() {
        return null;
    }
    
    protected final void emit(@org.jetbrains.annotations.NotNull()
    T viewState) {
    }
    
    public BaseViewModel() {
        super();
    }
}