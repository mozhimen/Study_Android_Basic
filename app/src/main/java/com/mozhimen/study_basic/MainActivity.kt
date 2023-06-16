package com.mozhimen.study_basic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goDiceRoller(view: View) {
        startActivity(Intent(this, DiceRollerActivity::class.java))
    }

    fun goLemonade(view: View) {
        startActivity(Intent(this, LemonadeActivity::class.java))
    }

    fun goTipCalculate(view: View) {
        startActivity(Intent(this, TipCalculateActivity::class.java))
    }
}