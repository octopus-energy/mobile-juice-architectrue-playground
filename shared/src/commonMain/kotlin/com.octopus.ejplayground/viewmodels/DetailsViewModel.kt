package com.octopus.ejplayground.viewmodels

import com.octopus.ejplayground.CurrentRepoRepository
import com.octopus.ejplayground.MakeInjectable
import com.octopus.ejplayground.SingleActivity
import com.octopus.ejplayground.domain.GithubRepo
import com.octopus.ejplayground.domain.Navigator

@SingleActivity
class DetailsViewModel @MakeInjectable constructor(
        private val navigator: Navigator,
        private val gitRepoRepository: CurrentRepoRepository
) : BaseViewModel<DetailsViewModel.ViewState>() {

    override var lastViewState: ViewState = ViewState()

    override fun onAttach() {
        super.onAttach()
        val githubRepo = gitRepoRepository.githubRepo
        if (githubRepo == null) {
            navigator.goToMain()
        } else {
            emit(
                lastViewState.copy(
                    toolbarTitle = githubRepo.name,
                    urlAddress = githubRepo.url
                )
            )
        }
    }

    fun onGoToRepositoryClicked() {
        navigator.goToUrl(gitRepoRepository.githubRepo!!.url)
    }

    data class ViewState(
            val toolbarTitle: String = "Yes?",
            val urlAddress: String = ""
    ) : BaseViewState
}