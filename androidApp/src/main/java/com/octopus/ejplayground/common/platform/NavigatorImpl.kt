package com.octopus.ejplayground.common.platform

import android.content.Intent
import android.net.Uri
import androidx.navigation.findNavController
import com.octopus.ejplayground.R
import com.octopus.ejplayground.githubrepositories.entities.GithubRepo
import com.octopus.ejplayground.extensions.startActivity
import com.octopus.ejplayground.AndroidPlaygroundActivity
import com.octopus.ejplayground.common.SingleActivity
import com.octopus.ejplayground.githubrepositories.CurrentRepoRepository
import com.octopus.ejplayground.githubrepositories.DetailsFragmentDirections
import com.octopus.ejplayground.githubrepositories.MainFragmentDirections
import javax.inject.Inject

@SingleActivity
class NavigatorImpl @Inject constructor(
    private val androidPlaygroundActivity: AndroidPlaygroundActivity,
    private val currentRepoRepository: CurrentRepoRepository
): Navigator {

    override fun goToDetails(githubRepo: GithubRepo) {
        currentRepoRepository.githubRepo = githubRepo
        val action = MainFragmentDirections.actionMainFragmentToDetailsFragment()
        androidPlaygroundActivity.findNavController(R.id.nav_host_fragment).navigate(action)
    }

    override fun goToMain() {
        val action = DetailsFragmentDirections.actionDetailsFragmentToMainFragment()
        androidPlaygroundActivity.findNavController(R.id.nav_host_fragment).navigate(action)
    }

    override fun goToUrl(url: String) {
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).startActivity(androidPlaygroundActivity)
    }
}