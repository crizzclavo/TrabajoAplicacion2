package com.example.trabajoaplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    lateinit var etUsuario: EditText
    lateinit var etPass: EditText
    lateinit var cbRecordar: CheckBox
    lateinit var btnRegistrar: Button
    lateinit var btnIniciar: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



        // Vinculamos las variables con los IDs correspondientes a la vista
        etUsuario = findViewById(R.id.etUsuario)
        etPass = findViewById(R.id.etPass)
        cbRecordar = findViewById(R.id.cbRecordar)
        btnIniciar = findViewById(R.id.botonIniciar)
        btnRegistrar = findViewById(R.id.botonRegistrar)

        btnRegistrar.setOnClickListener {
            // Mostramos un mensaje
            Toast.makeText(this, "Registrar Usuario", Toast.LENGTH_SHORT).show()
            // Indicamos a que pantalla queremos ir
            val intentRegister = Intent(this, RegisterActivity::class.java)
            // Cambiamos de pantalla
            startActivity(intentRegister)
            // Eliminamos la Activity actual para sacarla de la Pila
            finish()
        }

        btnIniciar.setOnClickListener {
            var mensaje = "Iniciar Sesion:"
            // Obtenemos el dato que se ingreso en la vista
            var nombreUsuario = etUsuario.text.toString()
            if(nombreUsuario.isEmpty() || etPass.text.toString().isEmpty()){
               mensaje+= " Faltan Datos"
            } else {
                mensaje+= "  Datos OK"

                val intentRegister = Intent(this, MainActivity::class.java)
                // Cambiamos de pantalla
                startActivity(intentRegister)
                // Eliminamos la Activity actual para sacarla de la Pila
                finish()
                // Verificamos si esta tildado el CechBox
                if(cbRecordar.isChecked) {
                    mensaje += " Recordar Usuario"

                }
            }
            Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()


        }
    }
}