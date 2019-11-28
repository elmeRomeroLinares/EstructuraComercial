package com.estructuracomercial.android

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.estructuracomercial.android.HomeFragment.Companion.ALMACEN
import com.estructuracomercial.android.HomeFragment.Companion.CENTRO_COMERCIAL
import com.estructuracomercial.android.HomeFragment.Companion.MERCADO

class CategoryFragment : Fragment(), CategoryAdapter.OnCategoryListener {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_category_list, container, false)
    }

    private var category: Int? = null
    private var seleccion: String? = null
    private var miSelccion: Int = 0
    private var adapter: CategoryAdapter? = null
    private var callback: CategoryListener? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var data: List<String>? = null
        val recycler = view.findViewById<RecyclerView>(R.id.categories_rv)
        category = arguments?.getInt(ARG_SELECTION)
        category?.let {
            when (it) {
                CENTRO_COMERCIAL -> {
                    data = resources.getStringArray(R.array.tipos_centros_comerciales_array).asList()
                }
                ALMACEN -> {
                    data = resources.getStringArray(R.array.tipos_almacenes_array).asList()
                }
                MERCADO -> {
                    data = resources.getStringArray(R.array.tipos_almacenes_array).asList()
                }
            }
        }

        data?.let {
            adapter = CategoryAdapter(it, this)
            recycler.adapter = adapter
        }

        setHasOptionsMenu(true)
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if(context is CategoryListener){
            callback = context
        }
    }

    override fun onClickCategory(name: String) {
        category?.let {
            when (it) {
                CENTRO_COMERCIAL -> {
                    when(name){
                        "Centros Comerciales Grandes" -> {
                            miSelccion = 0
                        }
                        "Centros Comerciales Pequeños" -> {
                            miSelccion = 1
                        }
                        "Centros Comerciales Regional" -> {
                            miSelccion = 2
                        }
                    }
                }
                ALMACEN -> {
                    when(name) {
                        "Múltiples Sucursales" -> {
                            miSelccion = 3
                        }
                        "Grandes" -> {
                            miSelccion = 4
                        }
                        "Populares" -> {
                            miSelccion = 5
                        }
                    }
                }
                MERCADO -> {
                    when(name) {
                        "Mercados Municipales" -> {
                            miSelccion = 9
                        }
                    }

                }
            }
        }
        callback?.onCategoryClick(miSelccion)
    }

    interface CategoryListener{
        fun onCategoryClick(miSeleccion: Int)
    }

    companion object {
        const val ARG_SELECTION = "arg_selection"
        const val TAG = "category_fragment"

        fun getInstance(selection: Int) = CategoryFragment().apply {
            val bundle = Bundle()
            bundle.putInt(ARG_SELECTION, selection)
            arguments = bundle
        }
    }
}