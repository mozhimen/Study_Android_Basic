//package com.mozhimen.study.basic.material.activity
//
//import android.widget.Toast
//import  com.mozhimen.study.basic.material.R
//import  com.mozhimen.study.basic.material.databinding.ActivityCardViewBinding
//
//class CardViewActivity : ToolbarActivity<ActivityCardViewBinding>() {
//
//    override fun getViewBinding(): ActivityCardViewBinding {
//        return ActivityCardViewBinding.inflate(layoutInflater)
//    }
//
//    override fun setToolbar() {
//        mToolbar.setTitle(R.string.card_view)
//    }
//
//    override fun initView() {
//        mBinding.cardViewElevated.setOnClickListener {
//            Toast.makeText(this@CardViewActivity, "CardView", Toast.LENGTH_SHORT).show()
//        }
//    }
//
//}