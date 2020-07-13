package com.octopus.ejplayground.ui.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\u000f\u001a\u00020\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0002X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/octopus/ejplayground/ui/details/DetailsViewModel;", "Lcom/octopus/ejplayground/viewmodels/BaseViewModel;", "Lcom/octopus/ejplayground/ui/details/DetailsViewModel$ViewState;", "navigator", "Lcom/octopus/ejplayground/domain/Navigator;", "(Lcom/octopus/ejplayground/domain/Navigator;)V", "githubRepo", "Lcom/octopus/ejplayground/domain/GithubRepo;", "lastViewState", "getLastViewState", "()Lcom/octopus/ejplayground/ui/details/DetailsViewModel$ViewState;", "setLastViewState", "(Lcom/octopus/ejplayground/ui/details/DetailsViewModel$ViewState;)V", "initData", "", "onGoToRepositoryClicked", "ViewState", "androidApp_debug"})
@com.octopus.ejplayground.di.SingleActivity()
public final class DetailsViewModel extends com.octopus.ejplayground.viewmodels.BaseViewModel<com.octopus.ejplayground.ui.details.DetailsViewModel.ViewState> {
    @org.jetbrains.annotations.NotNull()
    private com.octopus.ejplayground.ui.details.DetailsViewModel.ViewState lastViewState;
    private com.octopus.ejplayground.domain.GithubRepo githubRepo;
    private final com.octopus.ejplayground.domain.Navigator navigator = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.octopus.ejplayground.ui.details.DetailsViewModel.ViewState getLastViewState() {
        return null;
    }
    
    @java.lang.Override()
    public void setLastViewState(@org.jetbrains.annotations.NotNull()
    com.octopus.ejplayground.ui.details.DetailsViewModel.ViewState p0) {
    }
    
    public final void initData(@org.jetbrains.annotations.NotNull()
    com.octopus.ejplayground.domain.GithubRepo githubRepo) {
    }
    
    public final void onGoToRepositoryClicked() {
    }
    
    @javax.inject.Inject()
    public DetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.octopus.ejplayground.domain.Navigator navigator) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/octopus/ejplayground/ui/details/DetailsViewModel$ViewState;", "Lcom/octopus/ejplayground/viewmodels/BaseViewState;", "toolbarTitle", "", "urlAddress", "(Ljava/lang/String;Ljava/lang/String;)V", "getToolbarTitle", "()Ljava/lang/String;", "getUrlAddress", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "androidApp_debug"})
    public static final class ViewState implements com.octopus.ejplayground.viewmodels.BaseViewState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String toolbarTitle = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String urlAddress = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getToolbarTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUrlAddress() {
            return null;
        }
        
        public ViewState(@org.jetbrains.annotations.NotNull()
        java.lang.String toolbarTitle, @org.jetbrains.annotations.NotNull()
        java.lang.String urlAddress) {
            super();
        }
        
        public ViewState() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.octopus.ejplayground.ui.details.DetailsViewModel.ViewState copy(@org.jetbrains.annotations.NotNull()
        java.lang.String toolbarTitle, @org.jetbrains.annotations.NotNull()
        java.lang.String urlAddress) {
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