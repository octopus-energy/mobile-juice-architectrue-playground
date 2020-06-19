package com.octopus.ejplayground.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/octopus/ejplayground/services/GithubService;", "", "githubApiBuilder", "Lcom/octopus/ejplayground/services/GithubApiBuilder;", "(Lcom/octopus/ejplayground/services/GithubApiBuilder;)V", "githubApi", "Lcom/octopus/ejplayground/services/GitHubApi;", "fetchCodeRepos", "Lio/reactivex/Observable;", "", "Lcom/octopus/ejplayground/services/GithubRepoEntity;", "username", "", "androidApp_debug"})
public final class GithubService {
    private final com.octopus.ejplayground.services.GitHubApi githubApi = null;
    private final com.octopus.ejplayground.services.GithubApiBuilder githubApiBuilder = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.octopus.ejplayground.services.GithubRepoEntity>> fetchCodeRepos(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    @javax.inject.Inject()
    public GithubService(@org.jetbrains.annotations.NotNull()
    com.octopus.ejplayground.services.GithubApiBuilder githubApiBuilder) {
        super();
    }
}