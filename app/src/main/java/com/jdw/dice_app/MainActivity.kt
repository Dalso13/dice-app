package com.jdw.dice_app

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.jdw.dice_app.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var bingding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bingding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val diceImage1 = findViewById<ImageView>(R.id.diceOne)
        val diceImage2 = findViewById<ImageView>(R.id.diceTwo)


        bingding.diceBtn.setOnClickListener {
            Toast.makeText(this, "굴림", Toast.LENGTH_LONG).show()

            val one = Random.nextInt(1, 7)
            val two = Random.nextInt(1, 7)

            diceImage1.setImageResource(diceChange(one))
            diceImage2.setImageResource(diceChange(two))

        }


    }

    private fun diceChange(num:Int) : Int{
        return when (num) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_1
        }
    }
}