package com.mozhimen.study_basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.mozhimen.study_basic.databinding.ActivityDiceRollerBinding

/**
 * @ClassName DiceRollerActivity
 * @Description
 * https://developer.android.com/courses/android-basics-kotlin/unit-1?hl=zh-tw
 * ANDROID KOTLIN 基本概念
 * 單元 1：Kotlin 基本概念
 * 使用 Kotlin 程式設計語言建構您的第一個 Android 應用程式。您可以在 Android 應用程式中加入圖片和文字，並瞭解如何使用類別、物件和條件式，為使用者建立互動式應用程式。
 *
 * @Author mozhimen / Kolin Zhao
 * @Date 2022/11/27 17:37
 * @Version 1.0
 */

class DiceRollerActivity : AppCompatActivity() {
    private lateinit var _vb: ActivityDiceRollerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _vb = DataBindingUtil.setContentView(this, R.layout.activity_dice_roller)
        setContentView(_vb.root)

        _vb.rollButton.setOnClickListener { rollDice() }
    }

    /**
     * Click listener for the Roll button.
     */
    private fun rollDice() {
        // Toast.makeText(this, "button clicked",
        //  Toast.LENGTH_SHORT).show()
        val randomInt = (1..6).random()

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        _vb.diceImage.setImageResource(drawableResource)
    }

    class Dice(val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}