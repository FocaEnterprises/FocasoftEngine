package me.giverplay.karma.project.list

import android.net.Uri
import android.util.Log
import androidx.recyclerview.widget.RecyclerView

import android.view.LayoutInflater
import android.view.View

import android.view.ViewGroup
import com.squareup.picasso.Picasso
import me.giverplay.karma.R

class ProjectAdapter(private val projectList: List<ProjectModel>): RecyclerView.Adapter<ViewHolder>() {

    private var clickListener: OnItemClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.project_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(itemViewHolder: ViewHolder, itemPosition: Int) {
        itemViewHolder.nameTextView.text = projectList[itemPosition].name
        itemViewHolder.decriptionTextView.text = projectList[itemPosition].description
        Picasso.get().load(Uri.parse(projectList[itemPosition].imageIcon)).into(itemViewHolder.imageIconView)
    }

    override fun getItemCount(): Int {
        return projectList.size
    }

    interface OnItemClickListener {
        fun onClick(position: Int, name: String)
    }

    fun setOnItemClickListener(listener: OnItemClickListener?) {
        clickListener = listener
    }
}