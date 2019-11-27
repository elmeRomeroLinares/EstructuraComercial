package com.estructuracomercial.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

class MainActivity : AppCompatActivity(), HomeFragment.HomeFragmentListener, CategoryFragment.CategoryListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.frame, HomeFragment()).commit()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home -> super.onBackPressed()
        }

        return true
    }

    override fun cardClick(selection: Int) {
        supportFragmentManager.beginTransaction().replace(R.id.frame, CategoryFragment.getInstance(selection),
            CategoryFragment.TAG).addToBackStack(CategoryFragment.TAG).commit()
    }

    override fun onCategoryClick(miSeleccion: Int) {
        supportFragmentManager.beginTransaction().replace(R.id.frame, LocalDetailFragment.getLocalDetailFragmentInstance(miSeleccion),
            LocalDetailFragment.TAG).addToBackStack(LocalDetailFragment.TAG).commit()    }
}
