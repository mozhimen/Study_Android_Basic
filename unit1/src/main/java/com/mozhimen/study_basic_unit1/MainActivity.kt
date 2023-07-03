package com.mozhimen.study_basic_unit1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goHappyBirthDay(view: View) {
        startActivity(Intent(this, HappyBirthDayActivity::class.java))
    }

    fun goDiceRoller(view: View) {
        startActivity(Intent(this, DiceRollerActivity::class.java))
    }
}