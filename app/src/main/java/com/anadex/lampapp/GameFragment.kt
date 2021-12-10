package com.anadex.lampapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView


class GameFragment : Fragment() {

    private lateinit var lampImageView1: ImageView
    private lateinit var lampImageView2: ImageView
    private lateinit var lampImageView3: ImageView

    var lampImage1: Int = 0
    var lampImage2: Int = 0
    var lampImage3: Int = 0


    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_game, container, false)

        lampImageView1 = view.findViewById(R.id.lamp_view_1)
        lampImageView2 = view.findViewById(R.id.lamp_view_2)
        lampImageView3 = view.findViewById(R.id.lamp_view_3)


        lampImageView1.setOnClickListener {
            if (lampImageView1.drawable.constantState == resources.getDrawable(R.drawable.lamp_light).constantState) {
                lampImage1 = R.drawable.lamp_nolight
                lampImageView1.setImageResource(lampImage1);
            } else {
                lampImage1 = R.drawable.lamp_light
                lampImageView1.setImageResource(lampImage1);
            }

        }

        lampImageView2.setOnClickListener {
            if (lampImageView2.drawable.constantState == resources.getDrawable(R.drawable.lamp_light).constantState) {
                lampImage2 = R.drawable.lamp_nolight
                lampImageView2.setImageResource(lampImage2);
            } else {
                lampImage2 = R.drawable.lamp_light
                lampImageView2.setImageResource(lampImage2);
            }
        }

        lampImageView3.setOnClickListener {
            if (lampImageView3.drawable.constantState == resources.getDrawable(R.drawable.lamp_light).constantState) {
                lampImage3 = R.drawable.lamp_nolight
                lampImageView3.setImageResource(lampImage3);
            } else {
                lampImage3 = R.drawable.lamp_light
                lampImageView3.setImageResource(lampImage3);
            }
        }


        return view
    }


}


