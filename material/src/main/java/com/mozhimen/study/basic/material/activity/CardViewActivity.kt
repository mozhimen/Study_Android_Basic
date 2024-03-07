package com.mozhimen.study.basic.material.activity

import android.os.Bundle
import com.google.android.material.appbar.MaterialToolbar
import com.mozhimen.basick.utilk.android.widget.showToast
import com.mozhimen.study.basic.material.R
import com.mozhimen.study.basic.material.databinding.ActivityCardViewBinding

class CardViewActivity : ToolbarActivity<ActivityCardViewBinding>() {

    override fun initMaterialToolbar(materialToolbar: MaterialToolbar?) {
        super.initMaterialToolbar(materialToolbar)
        materialToolbar?.setTitle(R.string.card_view)
    }

    override fun initView(savedInstanceState: Bundle?) {
        vb.cardViewElevated.setOnClickListener {
            "CardView".showToast()
        }
    }
}