package com.estructuracomercial.android

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

class LocalDetailFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    var adapter: DetailAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recycler = view.findViewById<RecyclerView>(R.id.rv_detail)
        val repo = Repository()
        val miSeleccion = arguments?.getInt(SELECTION_EXTRA_BUNDLE)

        when(miSeleccion){
            0 -> setAdapter(repo.getCentrosComercialesGrandes(), recycler)
            1 -> setAdapter(repo.getCentrosComercialesPequenos(), recycler)
            2 -> setAdapter(repo.getCentrosComercialesRegionales(), recycler)
            4 -> setAdapter(repo.getMercadosMunicipales(),recycler)
        }

    }

    fun setAdapter(dataList: List<Local>, recycler: RecyclerView) {
        adapter = DetailAdapter(dataList)
        recycler.adapter = adapter
    }

    companion object {
        const val TAG = "local_detail_fragment"

        const val SELECTION_EXTRA_BUNDLE = "selection_extra"

        fun getLocalDetailFragmentInstance(miSeleccion: Int) = LocalDetailFragment().apply {
            val bundle = Bundle()
            bundle.putInt(SELECTION_EXTRA_BUNDLE, miSeleccion)
            arguments = bundle
        }
    }
}