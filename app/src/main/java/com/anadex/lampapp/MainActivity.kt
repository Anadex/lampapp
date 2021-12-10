package com.anadex.lampapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.androidgamesdk.GameActivity


class MainActivity : AppCompatActivity() {

    lateinit var gameActivityButton: Button
    lateinit var authorRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val authorList: List<Author> = listOf(

            Author(R.drawable.me, "Анастасия", "Разработчик"),
            Author(R.drawable.noch, "Noch", "Художник")
        )

        authorRecyclerView = findViewById(R.id.author_recycler_view)
        authorRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        authorRecyclerView.adapter = AuthorAdapter(authorList)
        authorRecyclerView.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )


        gameActivityButton = findViewById(R.id.game_activity_button)

        gameActivityButton.setOnClickListener {
            val gameActivityIntent: Intent = Intent(this, GameActivity2::class.java)

            startActivity(gameActivityIntent)
        }
    }

}