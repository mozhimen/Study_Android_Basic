package com.mozhimen.study.basic.material.activity

import android.os.Bundle
import com.google.android.material.appbar.MaterialToolbar
import  com.mozhimen.study.basic.material.R
import  com.mozhimen.study.basic.material.databinding.ActivitySwipeRefreshLayoutBinding

class SwipeRefreshLayoutActivity : ToolbarActivity<ActivitySwipeRefreshLayoutBinding>() {

    override fun initMaterialToolbar(materialToolbar: MaterialToolbar?) {
        super.initMaterialToolbar(materialToolbar)
        materialToolbar?.setTitle(R.string.swipe_refresh_layout)
    }

    override fun initView(savedInstanceState: Bundle?) {
        vb.swipeRefreshLayout.setColorSchemeResources(
            android.R.color.holo_blue_bright,
            android.R.color.holo_green_light,
            android.R.color.holo_orange_light
        )

        vb.swipeRefreshLayout.setOnRefreshListener {
            vb.swipeRefreshLayout.postDelayed({
                //关闭刷新
                vb.swipeRefreshLayout.isRefreshing = false
                vb.tvRefresh.text = "刷新完成"
            }, 2000)
        }
    }

}