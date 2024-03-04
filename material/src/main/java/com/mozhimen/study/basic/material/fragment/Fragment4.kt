package com.mozhimen.study.basic.material.fragment

import android.os.Bundle
import com.mozhimen.basick.elemk.androidx.fragment.bases.viewbinding.BaseFragmentVB
import com.mozhimen.study.basic.material.adapter.StringAdapter
import com.mozhimen.study.basic.material.databinding.FragmentFragment4Binding

class Fragment4 : BaseFragmentVB<FragmentFragment4Binding>() {

    private var mList: MutableList<String> = mutableListOf()

    override fun initData(savedInstanceState: Bundle?) {
        for (i in 0..19) {
            mList.add("MaterialDesign$i")
        }
        super.initData(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        vb.recycleView.adapter = StringAdapter(activity, mList)
    }
}