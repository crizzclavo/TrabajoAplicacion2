package com.example.trabajoaplicacion

class AlbumProvider {

    companion object{
        val albumList = listOf<Album>(
            Album(
                R.drawable.pablohoney1, "Pablo Honey", "Rock Alternativo",
                "Fecha:22/2/1993", 12


            ),
            Album(R.drawable.bends, "The Bends", "Rock Alternativo",
                "Fecha:13/3/1995", 21) ,

            Album(R.drawable.okcomput, "OK Computer", "Rock Alternativo/Electronica",
                "Fecha:16/6/1997", 12),

            Album(R.drawable.kid, "KID A", "Rock Alternativo/Electronica",
                "Fecha:4/6/2000", 10) ,

            Album(R.drawable.amne, "Amnesiac", "Rock Alternativo/Electronica",
                "Fecha:9/6/2001", 11)

        )



    }
}