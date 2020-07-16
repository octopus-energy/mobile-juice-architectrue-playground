package com.octopus.ejplayground.viewmodels

import com.octopus.ejplayground.MakeInjectable
import com.octopus.ejplayground.SingleActivity
import com.octopus.ejplayground.domain.GithubRepo
import com.octopus.ejplayground.domain.Navigator

@SingleActivity
class DetailsViewModel @MakeInjectable constructor(
        private val navigator: Navigator
) : BaseViewModel<DetailsViewModel.ViewState>() {

    override var lastViewState: ViewState = ViewState()
    private lateinit var githubRepo: GithubRepo

    fun initData(githubRepo: GithubRepo) {
        this.githubRepo = githubRepo
        emit(lastViewState.copy(
                toolbarTitle = githubRepo.name,
                urlAddress = githubRepo.url
        ))
    }

    fun onGoToRepositoryClicked() {
        navigator.goToUrl(githubRepo.url)
    }

    data class ViewState(
            val toolbarTitle: String = "Yes?",
            val urlAddress: String = ""
    ) : BaseViewState
}