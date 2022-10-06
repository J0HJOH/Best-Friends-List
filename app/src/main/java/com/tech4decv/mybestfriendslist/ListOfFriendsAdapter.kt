package com.tech4decv.mybestfriendslist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.RecyclerView
import com.tech4decv.mybestfriendslist.sampleData.SampleNames

class ListOfFriendsAdapter (val context : Context):
    RecyclerView.Adapter<ListOfFriendsAdapter.NamesViewHolder>() {
    private val sampleNames = SampleNames()
    private val listOfNames: List<Friends> = sampleNames.lIStOfNAMES


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        val itemView: View =
            LayoutInflater.from(context).inflate(R.layout.list_of_friends_layout,parent,false)
        return NamesViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        val name = listOfNames[position].name
        holder.name.text = name
        val profilePics = listOfNames[position].profile
        holder.profilePics.setImageResource(profilePics)

        holder.fav.setOnClickListener {
            holder.fav.setBackgroundResource(R.drawable.ic_baseline_favorite_24)
        }
    }

    override fun getItemCount(): Int {
        return listOfNames.size
    }


    class NamesViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val name : TextView = itemView.findViewById(R.id.friendsName)
        val profilePics : ImageView = itemView.findViewById(R.id.profilePics)
        val fav : ImageButton = itemView.findViewById(R.id.favorite)


    }
}