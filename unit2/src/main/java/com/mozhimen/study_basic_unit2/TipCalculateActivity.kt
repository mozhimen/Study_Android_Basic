package com.mozhimen.study_basic_unit2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.mozhimen.study_basic_unit2.R
import com.mozhimen.study_basic_unit2.databinding.ActivityTipCalculateBinding
import java.text.NumberFormat

/**
 * @ClassName DiceRollerActivity
 * @Description
 * 查看 Google 上的小费计算器：https://www.google.com/search?q=tip+calculator
 * https://developer.android.com/codelabs/basic-android-kotlin-training-xml-layouts?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-2-pathway-1%3Fhl%3Dzh-tw&hl=zh-cn#1
 * @Author mozhimen / Kolin Zhao
 * @Date 2022/11/27 17:37
 * @Version 1.0
 */
class TipCalculateActivity : AppCompatActivity() {
    private lateinit var _vb: ActivityTipCalculateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _vb = ActivityTipCalculateBinding.inflate(layoutInflater)
        setContentView(_vb.root)

        _vb.tipCalculateButton.setOnClickListener {
            calculateTip()
        }

        _vb.tipCostOfServiceEditText.setOnKeyListener { v, keyCode, _ ->
            handleKeyEvent(v, keyCode)
        }
    }

    private fun calculateTip() {
        val cost = _vb.tipCostOfServiceEditText.text.toString().toDoubleOrNull() ?: 0.0
        val tipPercentage = when (_vb.tipOptions.checkedRadioButtonId) {
            R.id.tip_option_twenty_percent -> 0.20
            R.id.tip_option_eighteen_percent -> 0.18
            else -> 0.15
        }
        var tip = tipPercentage * cost
        if (_vb.tipRoundUoSwitch.isChecked) {
            tip = kotlin.math.ceil(tip)
        }
        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        _vb.tipResult.text = getString(R.string.tip_amount_num, formattedTip)

    }

    private fun handleKeyEvent(view: View, keyCode: Int): Boolean {
        if (keyCode == KeyEvent.KEYCODE_ENTER) {
            // Hide the keyboard
            val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
            return true
        }
        return false
    }
}