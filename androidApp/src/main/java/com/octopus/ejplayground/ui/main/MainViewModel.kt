package com.octopus.ejplayground.ui.main

import com.octopus.ejplayground.di.SingleActivity
import com.octopus.ejplayground.domain.Announcer
import com.octopus.ejplayground.domain.GithubRepo
import com.octopus.ejplayground.domain.GithubRepoManager
import com.octopus.ejplayground.domain.Navigator
import com.octopus.ejplayground.ui.base.BaseViewModel
import com.octopus.ejplayground.ui.base.BaseViewState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@SingleActivity
class MainViewModel @Inject constructor(
        private val githubRepoManager: GithubRepoManager,
        private val navigator: Navigator,
        private val announcer: Announcer
) : BaseViewModel<MainViewModel.ViewState>() {

    private val TEST_USER: String = "JakeWharton"
    override var lastViewState = ViewState()

    fun loadResults() {
        emit(lastViewState.copy(loadingIsVisible = true))
        coroutineScope.launch {
            try {
                val result = withContext(Dispatchers.IO) { githubRepoManager.fetchSortedRepos(TEST_USER) }
                emit(lastViewState.copy(loadingIsVisible = false))
                emit(lastViewState.copy(results = result))
            } catch (e: Exception) {
                emit(lastViewState.copy(loadingIsVisible = false))
                announcer.announce(e.toString())
            }
        }
    }

    fun repoClicked(githubRepo: GithubRepo) {
        navigator.goToDetails(githubRepo)
    }

    data class ViewState(
            val loadingIsVisible: Boolean = false,
            val results: List<GithubRepo> = listOf()
    ) : BaseViewState
}
