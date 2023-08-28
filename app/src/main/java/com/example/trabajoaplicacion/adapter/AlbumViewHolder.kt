package com.example.trabajoaplicacion.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.trabajoaplicacion.R
import com.example.trabajoaplicacion.Album

class AlbumViewHolder(view:View): RecyclerView.ViewHolder(view) {

 val imgImagen= view.findViewById<ImageView>(R.id.ivAlbum)
    val titulo= view.findViewById<TextView>(R.id.tvTitulo)
    val genero = view.findViewById<TextView>(R.id.tvGenero)
    val fecha= view.findViewById<TextView>(R.id.tvFecha)


    fun render( albumModel: Album){
        Glide.with(imgImagen.context).load(albumModel.imgImagen).into(imgImagen)
       titulo.text= albumModel.titulo
        genero.text= albumModel.genero
        fecha.text= albumModel.fecha

    }
}