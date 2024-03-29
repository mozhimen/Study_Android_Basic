//package com.mozhimen.study.basic.material.activity
//
//import com.google.android.material.bottomsheet.BottomSheetBehavior
//import com.google.android.material.bottomsheet.BottomSheetDialog
//import  com.mozhimen.study.basic.material.R
//import  com.mozhimen.study.basic.material.databinding.ActivityBottomSheetBinding
//import  com.mozhimen.study.basic.material.dialog.MyBottomSheetDialog
//import  com.mozhimen.study.basic.material.dialog.MyFullDialog
//
//class BottomSheetActivity : ToolbarActivity<ActivityBottomSheetBinding>() {
//
//    override fun getViewBinding(): ActivityBottomSheetBinding {
//        return ActivityBottomSheetBinding.inflate(layoutInflater)
//    }
//
//    override fun setToolbar() {
//        mToolbar.setTitle(R.string.bottom_sheet)
//    }
//
//    override fun initView() {
//
//        mBinding.btnBottomSheet.setOnClickListener {
//            val behavior = BottomSheetBehavior.from(mBinding.llBottomSheet)
//            if (behavior.state == BottomSheetBehavior.STATE_EXPANDED) {
//                //如果是展开状态，则关闭，反之亦然
//                behavior.state = BottomSheetBehavior.STATE_COLLAPSED
//            } else {
//                behavior.state = BottomSheetBehavior.STATE_EXPANDED
//            }
//        }
//
//        mBinding.btnBottomSheetDialog.setOnClickListener {
//            val bottomSheetDialog = BottomSheetDialog(this)
//            bottomSheetDialog.setContentView(R.layout.dialog_bottom_sheet)
//            bottomSheetDialog.show()
//        }
//
//        mBinding.btnBottomSheetDialogFragment.setOnClickListener {
//            MyBottomSheetDialog().show(supportFragmentManager, "MyBottomSheetDialog")
//        }
//
//        mBinding.btnFull.setOnClickListener {
//            MyFullDialog().show(supportFragmentManager, "MyFullDialog")
//        }
//    }
//
//}