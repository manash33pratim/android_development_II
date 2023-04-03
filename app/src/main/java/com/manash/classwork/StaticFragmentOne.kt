package com.manash.classwork
import android.content.Context
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class StaticFragmentOne : Fragment() {
    lateinit var v:View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v= inflater.inflate(R.layout.fragment_static_fragment_one, container, false)
            init(container)
        return v
        }
    private lateinit var buttonListener:backPressCall
    override fun onAttach(context: Context) {
        super.onAttach(context)
        buttonListener=
            try {

                activity as backPressCall
            }
                catch(e:java.lang.ClassCastException)
                {
                    throw ClassCastException("$context" +"must implement onButtonPressed")

                }
    }
    fun init(root:ViewGroup?)
    {
        val but: Button = v.findViewById(R.id.send)
        val clear:Button = v.findViewById(R.id.send2)
        Toast.makeText(context, "init", Toast.LENGTH_LONG).show()
        but.setOnClickListener {
            buttonListener.onBackPressCall("Button has been clicked ")
        }
        clear.setOnClickListener {
            buttonListener.onBackPressCall("")
        }
    }

    }

