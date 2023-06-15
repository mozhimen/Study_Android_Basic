package com.mozhimen.study_basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.google.android.material.snackbar.Snackbar
import com.mozhimen.study_basic.databinding.ActivityLemonadeBinding

class LemonadeActivity : AppCompatActivity() {
    private lateinit var _vb: ActivityLemonadeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _vb = DataBindingUtil.setContentView(this, R.layout.activity_lemonade)
        setContentView(_vb.root)

        _vb.lemonImg.setOnClickListener {
            clickLemonImage()
        }
        _vb.lemonImg.setOnLongClickListener {

            true
        }
    }

    companion object {
        const val lemonSize = 3
    }

    private var squeezeCount = 0

    private fun clickLemonImage() {

    }

    private fun showSnackbar() {

    }

    private fun setViewElements() {

    }

    private fun pick() {

    }

    enum class LemonadeState {
        SELECT,
        SQUEEZE,
        DRINK,
        RESTART
    }
}