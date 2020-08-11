package com.octopus.ejplayground.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.octopus.ejplayground.R

class MainFragmentDirections private constructor() {
  companion object {
    fun actionMainFragmentToDetailsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainFragment_to_detailsFragment)
  }
}
