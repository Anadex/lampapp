package com.anadex.lampapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AuthorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val authorImageView: ImageView = itemView.findViewById(R.id.author_image_view)
    private val authorNameTextView: TextView = itemView.findViewById(R.id.author_name_text_view)
    private val authorRoleTextView: TextView = itemView.findViewById(R.id.author_role_text_view)

    fun bind(author: Author) {
        authorImageView.setImageResource(author.image)
        authorNameTextView.text=author.name
        authorRoleTextView.text=author.role
    }

}