package com.octopus.ejplayground.ui.details

import com.octopus.ejplayground.di.SingleActivity
import com.octopus.ejplayground.services.GithubRepoEntity
import com.octopus.ejplayground.domain.Navigator
import com.octopus.ejplayground.ui.base.BaseViewModel
import com.octopus.ejplayground.ui.base.BaseViewState
import javax.inject.Inject

@SingleActivity
class DetailsViewModel @Inject constructor(
        private val navigator: Navigator
) : BaseViewModel<DetailsViewModel.ViewState>() {

    override var lastViewState: ViewState = ViewState()
    private lateinit var githubRepoEntity: GithubRepoEntity

    fun initData(githubRepoEntity: GithubRepoEntity) {
        this.githubRepoEntity = githubRepoEntity
        emit(lastViewState.copy(
                toolbarTitle = githubRepoEntity.name,
                urlAddress = githubRepoEntity.url
        ))
    }

    fun onGoToRepositoryClicked() {
        navigator.goToUrl(githubRepoEntity.url)
    }

    data class ViewState(
            val toolbarTitle: String = "",
            val urlAddress: String = ""
    ) : BaseViewState
}