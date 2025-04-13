package com.example.tallersegundomomento.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.tallersegundomomento.R

class InicioFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_inicio, container, false)
    }
}
