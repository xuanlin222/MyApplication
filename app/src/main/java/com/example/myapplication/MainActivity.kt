package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    //val diceImage : ImageView? = null
    lateinit var diceImage : ImageView  //non nullable variable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)

        //operation here
        val rollButton : Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

    }

    //define a function
    private fun rollDice(){
        //Toast.makeText(this, "button clicked",
       // Toast.LENGTH_SHORT).show()
        val randomInt = (1..6).random()
        //;ine 26, 27 is for practical 1.2
        //val resultText : TextView = findViewById(R.id.result_text)
        //resultText.text = randomInt.toString()
        //val diceImage : ImageView = findViewById(R.id.dice_image)
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }
}