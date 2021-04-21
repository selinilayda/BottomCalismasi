package com.example.navigation_odev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_carpma.view.*
import kotlinx.android.synthetic.main.fragment_toplama.*
import kotlinx.android.synthetic.main.fragment_toplama.view.*


class CarpmaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val tasarim= inflater.inflate(R.layout.fragment_carpma_sonuc, container, false)

        tasarim.carpma.setOnClickListener {
            var carpmaSonuc = 0

            val sayi1 = Integer.parseInt(tasarim.topbir.text.toString())
            val sayi2 = Integer.parseInt(tasarim.topiki.text.toString())

            carpmaSonuc = topbir * topiki

            val gecis = CarpmaFragmentDirections.carpmaSonucGecis(carpmaSonuc)

            Navigation.findNavController(it).navigate(gecis)
        }

        return tasarim
    }


}