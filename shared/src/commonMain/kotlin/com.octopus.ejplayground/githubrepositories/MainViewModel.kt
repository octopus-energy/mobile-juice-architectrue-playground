package com.octopus.ejplayground.githubrepositories

import com.octopus.ejplayground.common.MakeInjectable
import com.octopus.ejplayground.common.SingleActivity
import com.octopus.ejplayground.common.platform.Announcer
import com.octopus.ejplayground.common.platform.Logger
import com.octopus.ejplayground.common.platform.Navigator
import com.octopus.ejplayground.common.threading.DispatcherProvider
import com.octopus.ejplayground.common.viewmodels.MotherViewModel
import com.octopus.ejplayground.githubrepositories.entities.GithubRepo
import kotlinx.coroutines.*

@SingleActivity
class MainViewModel @MakeInjectable constructor(
    private val githubRepoManager: GithubRepoManager,
    private val navigator: Navigator,
    private val announcer: Announcer,
    private val dispatcherProvider: DispatcherProvider,
    private val logger: Logger,
) : MotherViewModel<MainViewModel.ViewState, MainViewModel.UiAction>(
    dispatcherProvider
) {

    private val TEST_USER: String = "JakeWharton"

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
                val result = withContext(dispatcherProvider.main) {
                    githubRepoManager.fetchSortedRepos(TEST_USER)
                }
                emit(lastViewState.copy(loadingIsVisible = false, results = result))
            } catch (e: Exception) {
                logger.log("Exception = $e")
                emit(lastViewState.copy(loadingIsVisible = false))
                announcer.announce(e.toString())
            }
        }
    }

    override fun defaultViewState(): ViewState {
        return ViewState()
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