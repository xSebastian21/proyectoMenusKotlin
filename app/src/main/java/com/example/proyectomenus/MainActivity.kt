package com.example.proyectomenus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var btnMenu: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        btnMenu = findViewById(R.id.btnMenu)
        loadFragment(PantallaPrincipalFragment())

        // Evento al dar click a una de las opciones del botón
        btnMenu.setOnItemReselectedListener{MenuItem->
            when (MenuItem.itemId) {
                R.id.item0->{
                    supportActionBar?.setTitle("Consultar")
                    loadFragment(PantallaUnoFragmento())
                    true
                }
                R.id.item1->{
                    supportActionBar?.setTitle("Listar")
                    loadFragment(PantallaDosFragemento())
                    true
                }
                else->false
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView,fragment)
            .commit()
    }
}