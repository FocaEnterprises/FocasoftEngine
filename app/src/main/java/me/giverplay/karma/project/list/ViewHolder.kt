package me.giverplay.karma.project.list

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import me.giverplay.karma.R

class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val nameTextView: TextView = itemView.findViewById(R.id.project_name)
    val decriptionTextView: TextView = itemView.findViewById(R.id.project_description)
    val typeTextView: TextView = itemView.findViewById(R.id.project_style)
    val imageIconView: ImageView = itemView.findViewById(R.id.project_image_icon)
}