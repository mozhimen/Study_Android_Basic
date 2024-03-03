package com.mozhimen.study.basic.kedacom.demos.notice

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mozhimen.study.basic.kedacom.databinding.ActivityNoticeOtherBinding

/**
 * @ClassName NoticeOtherActivity
 * @Description TODO
 * @Author mozhimen
 * @Date 2021/4/13 15:43
 * @Version 1.0
 */
class NoticeOtherActivity: AppCompatActivity() {
    private lateinit var noticeOtherBinding: ActivityNoticeOtherBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        noticeOtherBinding=ActivityNoticeOtherBinding.inflate(layoutInflater)
        setContentView(noticeOtherBinding.root)

        noticeOtherBinding.noticeOtherCloseService.setOnClickListener {
            val intent=Intent(this, NoticeService::class.java)
            stopService(intent)
        }
    }
}