package com.mozhimen.study.basic.kedacom.demos.notice

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mozhimen.study.basic.kedacom.databinding.ActivityNoticeBinding

/**
 * @ClassName MessageActivity
 * @Description TODO
 * @Author mozhimen
 * @Date 2021/4/13 15:05
 * @Version 1.0
 */
class NoticeActivity: AppCompatActivity() {
    private lateinit var noticeBinding: ActivityNoticeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        noticeBinding= ActivityNoticeBinding.inflate(layoutInflater)
        setContentView(noticeBinding.root)

        noticeBinding.messageSend.setOnClickListener {
            val intent=Intent(this, NoticeService::class.java)
            startService(intent)
        }
    }

}