package com.example.trabajoaplicacion

import java.io.Serializable

data class Album (

    val imgImagen: Int,
    val titulo: String,
    val genero: String,
    val fecha: String,
    val canciones: Int,


) : Serializable