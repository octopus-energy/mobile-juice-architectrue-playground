package com.octopus.ejplayground.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.octopus.ejplayground.R

class DetailsFragmentDirections private constructor() {
  companion object {
    fun actionDetailsFragmentToMainFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_detailsFragment_to_mainFragment)
  }
}
