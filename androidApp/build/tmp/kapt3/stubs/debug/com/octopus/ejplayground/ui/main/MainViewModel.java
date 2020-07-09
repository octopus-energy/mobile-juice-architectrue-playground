package com.octopus.ejplayground.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\n\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u0002X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/octopus/ejplayground/ui/main/MainViewModel;", "Lcom/octopus/ejplayground/ui/base/BaseViewModel;", "Lcom/octopus/ejplayground/ui/main/MainViewModel$ViewState;", "githubRepoManager", "Lcom/octopus/ejplayground/domain/GithubRepoManager;", "navigator", "Lcom/octopus/ejplayground/domain/Navigator;", "announcer", "Lcom/octopus/ejplayground/domain/Announcer;", "(Lcom/octopus/ejplayground/domain/GithubRepoManager;Lcom/octopus/ejplayground/domain/Navigator;Lcom/octopus/ejplayground/domain/Announcer;)V", "TEST_USER", "", "lastViewState", "getLastViewState", "()Lcom/octopus/ejplayground/ui/main/MainViewModel$ViewState;", "setLastViewState", "(Lcom/octopus/ejplayground/ui/main/MainViewModel$ViewState;)V", "loadResults", "", "repoClicked", "githubRepo", "Lcom/octopus/ejplayground/GithubRepo;", "ViewState", "androidApp_debug"})
@com.octopus.ejplayground.di.SingleActivity()
public final class MainViewModel extends com.octopus.ejplayground.ui.base.BaseViewModel<com.octopus.ejplayground.ui.main.MainViewModel.ViewState> {
    private final java.lang.String TEST_USER = "JakeWharton";
    @org.jetbrains.annotations.NotNull()
    private com.octopus.ejplayground.ui.main.MainViewModel.ViewState lastViewState;
    private final com.octopus.ejplayground.domain.GithubRepoManager githubRepoManager = null;
    private final com.octopus.ejplayground.domain.Navigator navigator = null;
    private final com.octopus.ejplayground.domain.Announcer announcer = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.octopus.ejplayground.ui.main.MainViewModel.ViewState getLastViewState() {
        return null;
    }
    
    @java.lang.Override()
    public void setLastViewState(@org.jetbrains.annotations.NotNull()
    com.octopus.ejplayground.ui.main.MainViewModel.ViewState p0) {
    }
    
    public final void loadResults() {
    }
    
    public final void repoClicked(@org.jetbrains.annotations.NotNull()
    com.octopus.ejplayground.GithubRepo githubRepo) {
    }
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.octopus.ejplayground.domain.GithubRepoManager githubRepoManager, @org.jetbrains.annotations.NotNull()
    com.octopus.ejplayground.domain.Navigator navigator, @org.jetbrains.annotations.NotNull()
    com.octopus.ejplayground.domain.Announcer announcer) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/octopus/ejplayground/ui/main/MainViewModel$ViewState;", "Lcom/octopus/ejplayground/ui/base/BaseViewState;", "loadingIsVisible", "", "results", "", "Lcom/octopus/ejplayground/GithubRepo;", "(ZLjava/util/List;)V", "getLoadingIsVisible", "()Z", "getResults", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "androidApp_debug"})
    public static final class ViewState implements com.octopus.ejplayground.ui.base.BaseViewState {
        private final boolean loadingIsVisible = false;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.octopus.ejplayground.GithubRepo> results = null;
        
        public final boolean getLoadingIsVisible() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.octopus.ejplayground.GithubRepo> getResults() {
            return null;
        }
        
        public ViewState(boolean loadingIsVisible, @org.jetbrains.annotations.NotNull()
        java.util.List<com.octopus.ejplayground.GithubRepo> results) {
            super();
        }
        
        public ViewState() {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.octopus.ejplayground.GithubRepo> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.octopus.ejplayground.ui.main.MainViewModel.ViewState copy(boolean loadingIsVisible, @org.jetbrains.annotations.NotNull()
        java.util.List<com.octopus.ejplayground.GithubRepo> results) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}