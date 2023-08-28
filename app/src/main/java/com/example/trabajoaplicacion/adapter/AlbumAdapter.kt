package com.example.trabajoaplicacion.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.trabajoaplicacion.Album
import com.example.trabajoaplicacion.R

class AlbumAdapter(private val albumList: List<Album>) : RecyclerView.Adapter<AlbumViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
      val layoutInflater = LayoutInflater.from(parent.context)
          return AlbumViewHolder(layoutInflater.inflate(R.layout.item_album,parent, false))

    }

    override fun getItemCount(): Int =  albumList.size


    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
      val item = albumList [position]
        holder.render(item)
    }
}