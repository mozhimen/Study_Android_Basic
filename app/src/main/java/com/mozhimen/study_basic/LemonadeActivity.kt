package com.mozhimen.study_basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.google.android.material.snackbar.Snackbar
import com.mozhimen.study_basic.databinding.ActivityLemonadeBinding

/**
 * @ClassName LemonadeActivity
 * @Description TODO
 * @Author mozhimen / Kolin Zhao
 * @Date 2022/11/27 17:37
 * @Version 1.0
 */
class LemonadeActivity : AppCompatActivity() {
    companion object {
        const val lemonSize = 3
    }

    private lateinit var _vb: ActivityLemonadeBinding
    private var squeezeCount = 0
    private var currentState: LemonadeState = LemonadeState.SELECT

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _vb = DataBindingUtil.setContentView(this, R.layout.activity_lemonade)
        setContentView(_vb.root)

        _vb.lemonImg.setOnClickListener {
            clickLemonImage()
        }
        _vb.lemonImg.setOnLongClickListener {
            showSnackbar(currentState)
            true
        }

        setViewElements(currentState)
    }


    private fun clickLemonImage() {
        when (currentState) {
            LemonadeState.SELECT -> {
                currentState = LemonadeState.SQUEEZE
                pick()
                setViewElements(currentState)
            }

            LemonadeState.SQUEEZE -> {
                if (squeezeCount >= lemonSize) {
                    currentState = LemonadeState.DRINK
                    setViewElements(currentState)
                } else {
                    squeezeCount++
                }
            }

            LemonadeState.DRINK -> {
                currentState = LemonadeState.RESTART
                setViewElements(currentState)
            }

            LemonadeState.RESTART -> {
                currentState = LemonadeState.SELECT
                setViewElements(currentState)
            }
        }
    }

    private fun pick() {
        squeezeCount = 0
    }

    private fun showSnackbar(state: LemonadeState) {
        if (state == LemonadeState.SQUEEZE) {
            Snackbar.make(
                _vb.root,
                "Squeeze count: ${squeezeCount}, keep squeezing~",
                Snackbar.LENGTH_SHORT
            ).show()
        }
    }

    private fun setViewElements(state: LemonadeState) {
        when (state) {
            LemonadeState.SELECT -> {
                _vb.lemonTxt.text = getString(R.string.click_select_lemon)
                _vb.lemonImg.setImageResource(R.drawable.lemon_tree)
            }

            LemonadeState.SQUEEZE -> {
                _vb.lemonTxt.text = getString(R.string.click_squeeze_juice)
                _vb.lemonImg.setImageResource(R.drawable.lemon_squeeze)
            }

            LemonadeState.DRINK -> {
                _vb.lemonTxt.text = getString(R.string.click_drink_juice)
                _vb.lemonImg.setImageResource(R.drawable.lemon_drink)
            }

            LemonadeState.RESTART -> {
                _vb.lemonTxt.text = getString(R.string.click_restart)
                _vb.lemonImg.setImageResource(R.drawable.lemon_restart)
            }
        }
    }

    enum class LemonadeState {
        SELECT,
        SQUEEZE,
        DRINK,
        RESTART
    }
}