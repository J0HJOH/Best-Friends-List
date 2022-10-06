package com.tech4decv.mybestfriendslist

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var namesRecycler : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        namesRecycler = findViewById(R.id.namesRecycler)
        namesRecycler.adapter = ListOfFriendsAdapter(this)
        namesRecycler.layoutManager = LinearLayoutManager(this)
    }


}