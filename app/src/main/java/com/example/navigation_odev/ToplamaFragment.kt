package com.example.navigation_odev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_toplam_sonuc.*
import kotlinx.android.synthetic.main.fragment_toplama.*
import kotlinx.android.synthetic.main.fragment_toplama.view.*


class ToplamaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val tasarim= inflater.inflate(R.layout.fragment_carpma_sonuc, container, false)

        tasarim.toplama.setOnClickListener {

            val toplamSonuc= Integer.parseInt(topbir.text.toString()) + Integer.parseInt(topiki.text.toString())

            val gecis= ToplamaFragmentDirections.toplamaSonucGecis(toplamSonuc)

            Navigation.findNavController(it).navigate(R.id.toplamSonuc)
        }

        return tasarim
    }


}