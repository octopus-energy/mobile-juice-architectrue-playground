package com.octopus.ejplayground.githubrepositories

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.octopus.ejplayground.R
import com.octopus.ejplayground.common.ui.MotherFragment
import com.octopus.ejplayground.common.viewmodels.LifecycleReceiver
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

class MainFragment : MotherFragment() {

    companion object {
        fun newInstance(): MainFragment {
            return MainFragment()
        }
    }

    @Inject
    lateinit var mainViewModel: MainViewModel

    private var mainAdapter: MainAdapter? = null

    override fun getLifecycleReceivers(): List<LifecycleReceiver> {
        return listOf(mainViewModel)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)
        mainAdapter =
            MainAdapter { mainViewModel.onAction(MainViewModel.UiAction.RepositoryClicked(it)) }
        a_main_recycler.adapter = mainAdapter
        a_main_recycler.layoutManager = LinearLayoutManager(requireActivity())
        a_main_recycler.addItemDecoration(
            DividerItemDecoration(context, DividerItemDecoration.VERTICAL)
        )
        a_main_btn.setOnClickListener { mainViewModel.onAction(MainViewModel.UiAction.LoadReposClicked) }
    }

    override fun onStart() {
        super.onStart()
        mainViewModel.viewStateStream()
            .onEach {
                if (it.loadingIsVisible) {
                    a_main_progress.visibility = View.VISIBLE
                } else {
                    a_main_progress.visibility = View.INVISIBLE
                }
                mainAdapter?.addAll(it.results)
            }.launchIn(coroutineScope)
    }
}
