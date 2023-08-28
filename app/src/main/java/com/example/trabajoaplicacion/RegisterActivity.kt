package com.example.trabajoaplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {

lateinit var btnSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnSend=findViewById(R.id.botonEnviar)


        btnSend.setOnClickListener {
            // Mostramos un mensaje
            Toast.makeText(this, "Datos Enviados", Toast.LENGTH_SHORT).show()
            // Indicamos a que pantalla queremos ir

            val intentRegister = Intent(this, LoginActivity::class.java)
            // Cambiamos de pantalla
            startActivity(intentRegister)
            // Eliminamos la Activity actual para sacarla de la Pila
            finish()
        }


    }
}