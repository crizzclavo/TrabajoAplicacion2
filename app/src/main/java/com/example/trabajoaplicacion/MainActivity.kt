package com.example.trabajoaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.trabajoaplicacion.adapter.AlbumAdapter
import com.example.trabajoaplicacion.R

class MainActivity : AppCompatActivity() {



   /*private fun generarDatos(): ArrayList<Album>{
       val lista= ArrayList<Album>()
       lista.add(
           Album(R.drawable.pablohoney1, "Pablo Honey", "Rock Alternativo",
           "22/2/1993", 12)
       )

       lista.add(Album(R.drawable.bends, "The Bends", "Rock Alternativo",
           "13/3/1995", 21))

       lista.add(Album(R.drawable.okcomput, "OK Computer", "Rock Alternativo/Electronica",
           "16/6/1997", 12))

       lista.add(Album(R.drawable.kid, "KID A", "Rock Alternativo/Electronica",
           "4/6/2000", 10))

       lista.add(Album(R.drawable.amne, "Amnesiac", "Rock Alternativo/Electronica",
           "9/6/2001", 11))


       return lista

   } */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
    }

   private fun initRecyclerView(){
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerAlbum)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = AlbumAdapter(AlbumProvider.albumList)

    }
}