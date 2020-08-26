package com.octopus.ejplayground.githubrepositories

import com.octopus.ejplayground.common.MakeInjectable
import com.octopus.ejplayground.common.SingleActivity
import com.octopus.ejplayground.githubrepositories.entities.GithubRepo

@SingleActivity
class CurrentRepoRepository @MakeInjectable constructor() {

    var githubRepo: GithubRepo? = null
}