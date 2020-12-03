package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val foodlist= arrayListOf("pizza","burger","chola")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decidebtn.setOnClickListener {
            val random =Random()
            val randomfood=random.nextInt(foodlist.count())
            selectedfoodname.text=foodlist[randomfood]
        }
        addfoodbtn.setOnClickListener {
            val newfood=addfoodtxt.toString()
            foodlist.add(newfood)
        }
    }
}
