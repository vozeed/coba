package com.example.rolldadu

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButtom: Button =findViewById(R.id.roll_buttom)

        rollButtom.setOnClickListener{
            rollDice()


        }

    }

    private fun rollDice() {
        val diceimage: ImageView = findViewById(R.id.image_dice)
        val drawableRes = when(Random().nextInt(6)+1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceimage.setImageResource(drawableRes)
    }
}