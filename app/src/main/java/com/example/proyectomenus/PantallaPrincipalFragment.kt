package com.example.proyectomenus

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PantallaPrincipalFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

class PantallaPrincipalFragment : Fragment(R.layout.fragment_pantalla_principal) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val menuItem0 = requireView().findViewById<View>(R.id.item0)
        val menuItem1 = requireView().findViewById<View>(R.id.item1)
    }
}