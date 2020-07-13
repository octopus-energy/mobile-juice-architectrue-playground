package com.octopus.ejplayground.ui.details

import com.octopus.ejplayground.di.SingleActivity
import com.octopus.ejplayground.domain.GithubRepo
import com.octopus.ejplayground.domain.Navigator
import com.octopus.ejplayground.viewmodels.BaseViewModel
import com.octopus.ejplayground.viewmodels.BaseViewState
import javax.inject.Inject

@SingleActivity
class DetailsViewModel @Inject constructor(
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
            val toolbarTitle: String = "",
            val urlAddress: String = ""
    ) : BaseViewState
}