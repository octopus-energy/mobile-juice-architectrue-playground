package com.octopus.ejplayground.githubrepositories

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.octopus.ejplayground.R
import com.octopus.ejplayground.extensions.requireAppCompatActivity
import com.octopus.ejplayground.common.ui.MotherFragment
import com.octopus.ejplayground.common.viewmodels.LifecycleReceiver
import com.octopus.ejplayground.githubrepositories.DetailsViewModel
import kotlinx.android.synthetic.main.fragment_details.*
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

class DetailsFragment : MotherFragment() {

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
