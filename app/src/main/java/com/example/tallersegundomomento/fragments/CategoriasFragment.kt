package com.example.tallersegundomomento.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.tallersegundomomento.R

class CategoriasFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_categorias, container, false)

        val btnMaquillaje = view.findViewById<LinearLayout>(R.id.categoria_maquillaje)
        val btnCuidado = view.findViewById<LinearLayout>(R.id.categoria_cuidado)
        val btnAccesorios = view.findViewById<LinearLayout>(R.id.categoria_accesorios)
        val btnPerfumeria = view.findViewById<LinearLayout>(R.id.categoria_perfumeria)
        val btnUnas = view.findViewById<LinearLayout>(R.id.categoria_unas)

        btnMaquillaje.setOnClickListener {
            findNavController().navigate(R.id.maquillajeFragment)
        }

        btnCuidado.setOnClickListener {
            findNavController().navigate(R.id.cuidadoFacialFragment)
        }

        btnAccesorios.setOnClickListener {
            findNavController().navigate(R.id.accesoriosFragment)
        }

        btnPerfumeria.setOnClickListener {
            findNavController().navigate(R.id.perfumeriaFragment)
        }

        btnUnas.setOnClickListener {
            findNavController().navigate(R.id.unasFragment)
        }

        return view
    }
}
