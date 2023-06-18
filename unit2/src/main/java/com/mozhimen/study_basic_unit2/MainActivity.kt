package com.mozhimen.study_basic_unit2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mozhimen.study_basic_unit2.dogglers.DogglersActivity
import com.mozhimen.study_basic_unit2.recyclerview.RecyclerView2Activity
import com.mozhimen.study_basic_unit2.recyclerview.RecyclerViewActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goDiceRoller(view: View) {
        startActivity(Intent(this, com.mozhimen.study_basic_unit1.DiceRollerActivity::class.java))
    }

    fun goLemonade(view: View) {
        startActivity(Intent(this, LemonadeActivity::class.java))
    }

    fun goTipCalculate(view: View) {
        startActivity(Intent(this, TipCalculateActivity::class.java))
    }

    fun goRecyclerView(view: View) {
        startActivity(Intent(this, RecyclerViewActivity::class.java))
    }

    fun goRecyclerView2(view: View) {
        startActivity(Intent(this, RecyclerView2Activity::class.java))
    }

    fun goDogglers(view: View) {
        startActivity(Intent(this, DogglersActivity::class.java))
    }
}