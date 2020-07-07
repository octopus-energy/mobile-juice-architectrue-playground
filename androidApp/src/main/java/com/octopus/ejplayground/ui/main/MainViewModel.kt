package com.octopus.ejplayground.ui.main

import com.octopus.ejplayground.di.SingleActivity
import com.octopus.ejplayground.domain.Announcer
import com.octopus.ejplayground.domain.GithubRepo
import com.octopus.ejplayground.domain.GithubRepoManager
import com.octopus.ejplayground.services.GithubService
import com.octopus.ejplayground.domain.Navigator
import com.octopus.ejplayground.ui.base.BaseViewModel
import com.octopus.ejplayground.ui.base.BaseViewState
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
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
        githubRepoManager.fetchSortedRepos(TEST_USER)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        {
                            emit(lastViewState.copy(results = it))
                        },
                        {
                            announcer.announce(it.toString())
                        },
                        {
                            emit(lastViewState.copy(loadingIsVisible = false))
                        }
                ).addToComposite()
    }

    fun repoClicked(githubRepo: GithubRepo) {
        navigator.goToDetails(githubRepo)
    }

    data class ViewState(
            val loadingIsVisible: Boolean = false,
            val results: List<GithubRepo> = listOf()
    ) : BaseViewState
}
