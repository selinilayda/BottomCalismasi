package com.example.navigation_odev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_carpma_sonuc.view.*
import kotlinx.android.synthetic.main.fragment_toplam_sonuc.view.*


class CarpmaSonuc : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val tasarim= inflater.inflate(R.layout.fragment_carpma_sonuc, container, false)

        val bundle: CarpmaSonucFragmentArgs by navArgs()

        val gelenCarpma=bundle.carpmaSonuc.toString()

        tasarim.toplamsonuc.text = "TOPLAMA SONUC : $gelenCarpma"


        return tasarim
    }


}