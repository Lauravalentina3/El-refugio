package com.example.tallersegundomomento.fragments

import android.content.Context
import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.tallersegundomomento.R

class PerfilFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_perfil, container, false)

        val prefs = requireContext().getSharedPreferences("usuario", Context.MODE_PRIVATE)
        val nombre = prefs.getString("nombre", "Laura Valentina Guarín Sanchez")
        val correo = prefs.getString("correo", "lauraguasan05@gmail.com")
        val telefono = prefs.getString("telefono", "3106558734")


        // Asignar a las vistas
        view.findViewById<TextView>(R.id.tv_nombre).text = "Nombre: $nombre"
        view.findViewById<TextView>(R.id.tv_correo).text = "Correo: $correo"
        view.findViewById<TextView>(R.id.tv_telefono).text = "Teléfono: $telefono"

        // Ir a editar perfil
        view.findViewById<Button>(R.id.btn_editar).setOnClickListener {
            findNavController().navigate(R.id.editarperfilfragment)
        }

        return view
    }
}

