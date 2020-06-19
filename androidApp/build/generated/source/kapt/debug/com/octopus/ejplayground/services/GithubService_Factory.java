// Generated by Dagger (https://dagger.dev).
package com.octopus.ejplayground.services;

import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GithubService_Factory implements Factory<GithubService> {
  private final Provider<GithubApiBuilder> githubApiBuilderProvider;

  public GithubService_Factory(Provider<GithubApiBuilder> githubApiBuilderProvider) {
    this.githubApiBuilderProvider = githubApiBuilderProvider;
  }

  @Override
  public GithubService get() {
    return newInstance(githubApiBuilderProvider.get());
  }

  public static GithubService_Factory create(Provider<GithubApiBuilder> githubApiBuilderProvider) {
    return new GithubService_Factory(githubApiBuilderProvider);
  }

  public static GithubService newInstance(GithubApiBuilder githubApiBuilder) {
    return new GithubService(githubApiBuilder);
  }
}
