package com.mozhimen.study.basic.kedacom.web

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.mozhimen.study.basic.kedacom.databinding.ActivityWebviewBinding

/**
 * @ClassName WebViewActivity
 * @Description TODO
 * @Author mozhimen
 * @Date 2021/4/14 16:00
 * @Version 1.0
 */
class WebViewActivity : AppCompatActivity() {
    private lateinit var vb: ActivityWebviewBinding

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityWebviewBinding.inflate(layoutInflater)
        setContentView(vb.root)

        vb.webViewView.settings.javaScriptEnabled = true
        vb.webViewView.webViewClient = WebViewClient()
        vb.webViewView.loadUrl("https://www.baidu.com")
    }
}