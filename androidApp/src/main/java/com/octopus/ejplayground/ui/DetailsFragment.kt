package com.octopus.ejplayground.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.octopus.ejplayground.R
import com.octopus.ejplayground.extensions.requireAppCompatActivity
import com.octopus.ejplayground.viewmodels.DetailsViewModel
import com.octopus.ejplayground.viewmodels.LifecycleReceiver
import kotlinx.android.synthetic.main.fragment_details.*
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

class DetailsFragment : BaseFragment() {

    @Inject
    lateinit var detailsViewModel: DetailsViewModel

    override fun getLifecycleReceivers(): List<LifecycleReceiver> {
        return listOf(detailsViewModel)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)
        a_details_btn.setOnClickListener { detailsViewModel.onAction(DetailsViewModel.UiAction.RepositoryClicked) }
    }

    override fun onStart() {
        super.onStart()
        detailsViewModel.viewStateStream()
            .onEach {
                requireAppCompatActivity().supportActionBar?.title = it.toolbarTitle
                a_details_txt.text = it.urlAddress
            }.launchIn(coroutineScope)
    }
}
