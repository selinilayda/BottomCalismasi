package com.example.navigation_odev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_toplam_sonuc.view.*
import kotlinx.android.synthetic.main.fragment_toplama.view.*


class ToplamSonuc : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val tasarim= inflater.inflate(R.layout.fragment_carpma_sonuc, container, false)

        val bundle:ToplamSonucArgs by navArgs()


        val gelenToplam = bundle.toplamSonuc.toString()

        tasarim.toplamsonuc.text = "TOPLAMA SONUC : $gelenToplam"

        return tasarim

    }


}