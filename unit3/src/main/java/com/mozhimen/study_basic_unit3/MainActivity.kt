package com.mozhimen.study_basic_unit3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mozhimen.study_basic_unit3.dessert.DessertClickerActivity
import com.mozhimen.study_basic_unit3.navigation.NavigationWordsActivity
import com.mozhimen.study_basic_unit3.words.WordsActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goWords(view: View) {
        startActivity(Intent(this, WordsActivity::class.java))
    }

    fun goDessertClickers(view: View) {
        startActivity(Intent(this, DessertClickerActivity::class.java))
    }

    fun goNavigationWords(view: View) {
        startActivity(Intent(this, NavigationWordsActivity::class.java))
    }
}