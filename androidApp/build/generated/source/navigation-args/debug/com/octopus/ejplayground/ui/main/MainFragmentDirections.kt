package com.octopus.ejplayground.ui.main

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.octopus.ejplayground.R
import com.octopus.ejplayground.domain.GithubRepo
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

class MainFragmentDirections private constructor() {
  private data class ActionMainFragmentToDetailsFragment(
    val repository: GithubRepo
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_mainFragment_to_detailsFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(GithubRepo::class.java)) {
        result.putParcelable("repository", this.repository as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(GithubRepo::class.java)) {
        result.putSerializable("repository", this.repository as Serializable)
      } else {
        throw UnsupportedOperationException(GithubRepo::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  companion object {
    fun actionMainFragmentToDetailsFragment(repository: GithubRepo): NavDirections =
        ActionMainFragmentToDetailsFragment(repository)
  }
}
