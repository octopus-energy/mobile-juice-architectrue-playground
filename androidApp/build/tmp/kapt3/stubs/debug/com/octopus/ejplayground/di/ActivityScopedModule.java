package com.octopus.ejplayground.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/octopus/ejplayground/di/ActivityScopedModule;", "", "announcer", "Lcom/octopus/ejplayground/domain/Announcer;", "announcerImpl", "Lcom/octopus/ejplayground/ui/AnnouncerImpl;", "navigator", "Lcom/octopus/ejplayground/domain/Navigator;", "navigatorImpl", "Lcom/octopus/ejplayground/ui/NavigatorImpl;", "androidApp_debug"})
@dagger.Module()
public abstract interface ActivityScopedModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.octopus.ejplayground.domain.Navigator navigator(@org.jetbrains.annotations.NotNull()
    com.octopus.ejplayground.ui.NavigatorImpl navigatorImpl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.octopus.ejplayground.domain.Announcer announcer(@org.jetbrains.annotations.NotNull()
    com.octopus.ejplayground.ui.AnnouncerImpl announcerImpl);
}