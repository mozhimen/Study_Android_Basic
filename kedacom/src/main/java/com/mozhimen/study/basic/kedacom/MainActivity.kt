package com.mozhimen.study.basic.kedacom

import android.view.View
import com.mozhimen.basick.elemk.androidx.appcompat.bases.viewbinding.BaseActivityVB
import com.mozhimen.basick.utilk.android.content.startContext
import com.mozhimen.study.basic.kedacom.data.DataFirstActivity
import com.mozhimen.study.basic.kedacom.databinding.ActivityMainBinding
import com.mozhimen.study.basic.kedacom.demos.DemoActivity
import com.mozhimen.study.basic.kedacom.demos.fruit.FruitActivity
import com.mozhimen.study.basic.kedacom.dialog.AlertDialogActivity
import com.mozhimen.study.basic.kedacom.dialog.DialogActivity
import com.mozhimen.study.basic.kedacom.lv.ListViewActivity
import com.mozhimen.study.basic.kedacom.net.HttpActivity
import com.mozhimen.study.basic.kedacom.rv.RecyclerViewActivity
import com.mozhimen.study.basic.kedacom.rv.RecyclerViewHorizontalActivity
import com.mozhimen.study.basic.kedacom.rv.StaggeredActivity
import com.mozhimen.study.basic.kedacom.savedInstance.SavedInstanceActivity
import com.mozhimen.study.basic.kedacom.web.WebViewActivity

class MainActivity : BaseActivityVB<ActivityMainBinding>() {
    fun goData(view: View) {
        startContext<DataFirstActivity>()
    }
    fun goDemo(view: View) {
        startContext<DemoActivity>()
    }
    fun goAlertDialog(view: View) {
        startContext<AlertDialogActivity>()
    }
    fun goDialog(view: View) {
        startContext<DialogActivity>()
    }
    fun goListView(view: View) {
        startContext<ListViewActivity>()
    }
    fun goNet(view: View) {
        startContext<HttpActivity>()
    }
    fun goRv(view: View) {
        startContext<RecyclerViewActivity>()
    }
    fun goRvHorizontal(view: View) {
        startContext<RecyclerViewHorizontalActivity>()
    }
    fun goStaggered(view: View) {
        startContext<StaggeredActivity>()
    }
    fun goSavedInstance(view: View) {
        startContext<SavedInstanceActivity>()
    }
    fun goWeb(view: View) {
        startContext<WebViewActivity>()
    }
}