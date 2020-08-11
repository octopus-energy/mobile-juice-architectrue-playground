package com.octopus.ejplayground.viewmodels

import com.octopus.ejplayground.MakeInjectable
import com.octopus.ejplayground.SingleActivity
import com.octopus.ejplayground.domain.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@SingleActivity
class MainViewModel @MakeInjectable constructor(
    private val githubRepoManager: GithubRepoManager,
    private val navigator: Navigator,
    private val announcer: Announcer,
    private val dispatcherProvider: DispatcherProvider
) : MotherViewModel<MainViewModel.ViewState, MainViewModel.UiAction>(
    dispatcherProvider
) {

    private val TEST_USER: String = "JakeWharton"
    override var lastViewState = ViewState()

    override fun onAction(action: UiAction) {
        when (action) {
            is UiAction.RepositoryClicked -> navigator.goToDetails(action.githubRepo)
            is UiAction.LoadReposClicked -> loadResults()
        }
    }

    private fun loadResults() {
        emit(lastViewState.copy(loadingIsVisible = true))
        coroutineScope.launch {
            try {
                val result = withContext(dispatcherProvider.background) { githubRepoManager.fetchSortedRepos(TEST_USER) }
                emit(lastViewState.copy(loadingIsVisible = false))
                emit(lastViewState.copy(results = result))
            } catch (e: Exception) {
                emit(lastViewState.copy(loadingIsVisible = false))
                announcer.announce(e.toString())
            }
        }
    }

    data class ViewState(
            val loadingIsVisible: Boolean = false,
            val results: List<GithubRepo> = listOf()
    ) : MotherViewModel.ViewState

    sealed class UiAction : MotherViewModel.UiAction {
        data class RepositoryClicked(val githubRepo: GithubRepo) : UiAction()
        object LoadReposClicked : UiAction()
    }
}
