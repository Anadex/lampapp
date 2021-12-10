package com.anadex.lampapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AuthorAdapter(private val authorList: List<Author>) :
    RecyclerView.Adapter<AuthorViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AuthorViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.author_list_item, parent, false)
        return AuthorViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AuthorViewHolder, position: Int) {
        val author= authorList[position]
        holder.bind(author)
    }

    override fun getItemCount(): Int {
        return authorList.size
    }

}