package com.mozhimen.study.basic.kedacom.demos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mozhimen.basick.elemk.androidx.appcompat.bases.viewbinding.BaseActivityVB
import com.mozhimen.basick.utilk.android.content.startContext
import com.mozhimen.study.basic.kedacom.R
import com.mozhimen.study.basic.kedacom.data.DataFirstActivity
import com.mozhimen.study.basic.kedacom.databinding.ActivityDemoBinding
import com.mozhimen.study.basic.kedacom.demos.contacts.ContactsActivity
import com.mozhimen.study.basic.kedacom.demos.fruit.FruitActivity
import com.mozhimen.study.basic.kedacom.demos.news.News
import com.mozhimen.study.basic.kedacom.demos.news.NewsContentActivity
import com.mozhimen.study.basic.kedacom.demos.notice.NoticeActivity
import com.mozhimen.study.basic.kedacom.demos.talk.TalkActivity

class DemoActivity : BaseActivityVB<ActivityDemoBinding>() {
    fun goContacts(view: View) {
        startContext<ContactsActivity>()
    }

    fun goFruit(view: View) {
        startContext<FruitActivity>()
    }

    fun goNews(view: View) {
        startContext<NewsContentActivity>()
    }

    fun goNotice(view: View) {
        startContext<NoticeActivity>()
    }

    fun goTalk(view: View) {
        startContext<TalkActivity>()
    }
}