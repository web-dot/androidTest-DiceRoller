package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            //Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
            //val resultTextView: TextView = findViewById(R.id.textView)
            //resultTextView.text = "6"
            rollDice()
        }
    }

    fun rollDice(){
        val dice1 = Dice(6)
        val diceRoll1 = dice1.roll()
        val resultTextView1: TextView = findViewById(R.id.textView)
        resultTextView1.text = diceRoll1.toString()

        val dice2 = Dice(6)
        val diceRoll2 = dice2.roll()
        val resultTextView2: TextView = findViewById(R.id.textView2)
        resultTextView2.text = diceRoll2.toString()
    }
}

class Dice(val numSides: Int){

    fun roll(): Int{
        return (1..numSides).random()
    }
}