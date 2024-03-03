package com.mozhimen.study.basic.material.activity

import android.os.Bundle
import com.google.android.material.appbar.MaterialToolbar
import  com.mozhimen.study.basic.material.R
import  com.mozhimen.study.basic.material.databinding.ActivityFloatingActionButtonBinding

class FloatingActionButtonActivity : ToolbarActivity<ActivityFloatingActionButtonBinding>() {

    override fun initMaterialToolbar(materialToolbar: MaterialToolbar?) {
        super.initMaterialToolbar(materialToolbar)
        materialToolbar?.setTitle(R.string.floating_action_button)
    }

    override fun initView(savedInstanceState: Bundle?) {
        vb.floatingButton.setOnClickListener {
        }
    }
}