package com.manash.classwork

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class StaticFragmentTwoDemo : Fragment() {


lateinit var textView:TextView
lateinit var v1:View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        v1 = inflater.inflate(R.layout.fragment_static_fragment_two_demo, container, false)
    return v1

    }

    override fun onAttach(context: Context){
        super.onAttach(context)
    }
    fun onFragmentInteraction(msg:String){
        Log.d("K202",uri)
        textView =v1.findViewById(R.id.tv1)
        textView.setText(uri)
    }
}