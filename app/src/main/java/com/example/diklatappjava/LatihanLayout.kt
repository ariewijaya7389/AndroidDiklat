package com.example.diklatappjava

import android.content.res.Configuration
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_latihan_layout.*

class LatihanLayout : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_layout)

        //casting view
//        val boxOne = findViewById<TextView>(R.id.textViewBoxOne)
//        val buttonYellow = findViewById<Button>(R.id.buttonYellow)

        buttonGreen.setOnClickListener(this)
        buttonRed.setOnClickListener(this)
        buttonYellow.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){

//            R.id.buttonGreen -> coloringBox(Color.GREEN)
//            R.id.buttonYellow -> coloringBox(Color.YELLOW)
//            R.id.buttonRed -> coloringBox(Color.RED)
            R.id.buttonGreen -> coloringBox(resources.getColor(R.color.greenBox), resources.getColor(R.color.textClicked))
            R.id.buttonYellow -> coloringBox(resources.getColor(R.color.yellowBox), resources.getColor(R.color.textClicked))
            R.id.buttonRed -> coloringBox(resources.getColor(R.color.redBox), resources.getColor(R.color.textClicked))

        }
    }

    private fun coloringBox(color: Int, clr: Int  ){
        textViewBoxOne.setBackgroundColor(color)
        textViewBoxOne.setTextColor(clr)
        textViewBoxTwo.setBackgroundColor(color)
        textViewBoxTwo.setTextColor(clr)
        textViewBoxThree.setBackgroundColor(color)
        textViewBoxThree.setTextColor(clr)
        textViewBoxFour.setBackgroundColor(color)
        textViewBoxFour.setTextColor(clr)
        textViewBoxFive.setBackgroundColor(color)
        textViewBoxFive.setTextColor(clr)

    }



}
