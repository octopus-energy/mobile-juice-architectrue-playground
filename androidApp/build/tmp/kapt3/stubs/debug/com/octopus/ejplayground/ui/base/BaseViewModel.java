package com.octopus.ejplayground.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0004\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0012H\u0017J\b\u0010\u0015\u001a\u00020\u0012H\u0017J\f\u0010\u0016\u001a\u00020\u0012*\u00020\u0017H\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\u00028\u0000X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001f\u0010\f\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00018\u00008\u00000\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0018"}, d2 = {"Lcom/octopus/ejplayground/ui/base/BaseViewModel;", "T", "Lcom/octopus/ejplayground/ui/base/BaseViewState;", "Lcom/octopus/ejplayground/ui/base/LifecycleReceiver;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "lastViewState", "getLastViewState", "()Lcom/octopus/ejplayground/ui/base/BaseViewState;", "setLastViewState", "(Lcom/octopus/ejplayground/ui/base/BaseViewState;)V", "viewStateEmitter", "Lio/reactivex/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "getViewStateEmitter", "()Lio/reactivex/subjects/BehaviorSubject;", "emit", "", "viewState", "onAttach", "onDetach", "addToComposite", "Lio/reactivex/disposables/Disposable;", "androidApp_debug"})
public abstract class BaseViewModel<T extends com.octopus.ejplayground.ui.base.BaseViewState> implements com.octopus.ejplayground.ui.base.LifecycleReceiver {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<T> viewStateEmitter = null;
    private io.reactivex.disposables.CompositeDisposable compositeDisposable;
    
    @org.jetbrains.annotations.NotNull()
    public abstract T getLastViewState();
    
    public abstract void setLastViewState(@org.jetbrains.annotations.NotNull()
    T p0);
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<T> getViewStateEmitter() {
        return null;
    }
    
    @androidx.annotation.CallSuper()
    @java.lang.Override()
    public void onAttach() {
    }
    
    @androidx.annotation.CallSuper()
    @java.lang.Override()
    public void onDetach() {
    }
    
    protected final void emit(@org.jetbrains.annotations.NotNull()
    T viewState) {
    }
    
    protected final void addToComposite(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable $this$addToComposite) {
    }
    
    public BaseViewModel() {
        super();
    }
}