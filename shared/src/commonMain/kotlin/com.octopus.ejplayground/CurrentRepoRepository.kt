package com.octopus.ejplayground

import com.octopus.ejplayground.domain.GithubRepo

@SingleActivity
class CurrentRepoRepository @MakeInjectable constructor() {

    var githubRepo: GithubRepo? = null
}