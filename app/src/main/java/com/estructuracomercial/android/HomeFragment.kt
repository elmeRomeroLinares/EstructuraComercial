package com.estructuracomercial.android

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(){
    private var callback: HomeFragmentListener? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        card1.setOnClickListener{
            callback?.cardClick(CENTRO_COMERCIAL)
        }
        card2.setOnClickListener{
            callback?.cardClick(ALMACEN)
        }
        card3.setOnClickListener{
            callback?.cardClick(MERCADO)
        }

        setHasOptionsMenu(true)
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(false)
    }

    interface HomeFragmentListener{
        fun cardClick(selection: Int)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if(context is HomeFragmentListener){
            callback = context
        }
    }

    companion object{
        const val CENTRO_COMERCIAL = 1
        const val ALMACEN = 2
        const val MERCADO = 3
    }
}