package com.octopus.ejplayground.githubrepositories

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.octopus.ejplayground.R
import com.octopus.ejplayground.githubrepositories.entities.GithubRepo

class MainAdapter(
        private val listener: (GithubRepo) -> Unit
) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    private var items: List<GithubRepo> = listOf()

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
    ): ViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view: View = layoutInflater.inflate(R.layout.recycler_row, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        holder.bind(items[position], listener)
    }

    fun addAll(items: List<GithubRepo>) {
        this.items = items
        notifyDataSetChanged()
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(
            repository: GithubRepo,
            listener: (GithubRepo) -> Unit
        ) {
//            with(itemView) {
//                r_main_txt.text = repository.name
//                setOnClickListener { listener(repository) }
//            }
        }
    }
}