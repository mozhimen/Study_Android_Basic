package com.mozhimen.study.basic.material.activity

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.core.content.ContextCompat
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.snackbar.Snackbar
import com.mozhimen.basick.utilk.android.widget.showToast
import com.mozhimen.study.basic.material.R
import com.mozhimen.study.basic.material.databinding.ActivitySnackbarBinding

class SnackbarActivity : ToolbarActivity<ActivitySnackbarBinding>() {

    override fun initMaterialToolbar(materialToolbar: MaterialToolbar?) {
        super.initMaterialToolbar(materialToolbar)
        materialToolbar?.setTitle(R.string.snack_bar)
    }

    override fun initView(savedInstanceState: Bundle?) {

        vb.button.setOnClickListener {
            Snackbar.make(vb.constraintLayout, "已加入行程", Snackbar.LENGTH_SHORT).show()
        }

        vb.button2.setOnClickListener {
            val mSnackbar = Snackbar.make(vb.constraintLayout, "已加入行程", Snackbar.LENGTH_INDEFINITE)
            //设置Action并监听事件
            mSnackbar.setAction("知道了") {
                "好的".showToast()
            }.show()
        }

        vb.button3.setOnClickListener {
            val mSnackbar = Snackbar.make(vb.constraintLayout, "已加入行程", Snackbar.LENGTH_INDEFINITE)
            //设置Snackbar的背景颜色
            mSnackbar.view.setBackgroundColor(ContextCompat.getColor(this@SnackbarActivity, R.color.colorPrimary))
            //设置Action文字的背景颜色
            mSnackbar.setActionTextColor(Color.WHITE)
            //设置Action并监听事件
            mSnackbar.setAction("知道了") {
                "好的".showToast()
            }.show()
            //添加回调
            mSnackbar.addCallback(object : Snackbar.Callback() {
                override fun onDismissed(transientBottomBar: Snackbar, event: Int) {
                    super.onDismissed(transientBottomBar, event)
                    Log.i(TAG, "onDismissed--->> " + "onDismissed")
                }

                override fun onShown(sb: Snackbar) {
                    super.onShown(sb)
                    Log.i(TAG, "onShown--->> " + "onShown")
                }
            })
        }
    }
}