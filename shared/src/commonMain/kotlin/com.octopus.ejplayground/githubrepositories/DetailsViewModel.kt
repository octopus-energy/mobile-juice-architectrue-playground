package com.octopus.ejplayground.githubrepositories

import com.octopus.ejplayground.common.*
import com.octopus.ejplayground.common.platform.Navigator
import com.octopus.ejplayground.common.threading.DispatcherProvider
import com.octopus.ejplayground.common.viewmodels.MotherViewModel

@SingleActivity
class DetailsViewModel @MakeInjectable constructor(
    private val navigator: Navigator,
    private val dispatcherProvider: DispatcherProvider,
    private val gitRepoRepository: CurrentRepoRepository
) : MotherViewModel<DetailsViewModel.ViewState, DetailsViewModel.UiAction>(
    dispatcherProvider
) {

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

    override fun onAction(action: UiAction) {
        when (action) {
            UiAction.RepositoryClicked -> navigator.goToUrl(gitRepoRepository.githubRepo!!.url)
        }
    }

    override fun defaultViewState(): ViewState {
        return ViewState()
    }

    data class ViewState(
            val toolbarTitle: String = "Yes?",
            val urlAddress: String = ""
    ) : MotherViewModel.ViewState

    sealed class UiAction : MotherViewModel.UiAction {
        object RepositoryClicked : UiAction()
    }
}