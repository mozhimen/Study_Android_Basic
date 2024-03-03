package com.mozhimen.study.basic.kedacom.demos.news

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mozhimen.study.basic.kedacom.databinding.ActivityNewsContentBinding

class NewsContentActivity : AppCompatActivity() {

    private lateinit var newsBinding: ActivityNewsContentBinding

    companion object {
        fun actionStart(context: Context, title: String, content: String) {
            val intent = Intent(context, NewsContentActivity::class.java).apply {
                putExtra("news_title", title)
                putExtra("news_content", content)
            }
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        newsBinding = ActivityNewsContentBinding.inflate(layoutInflater)
        setContentView(newsBinding.root)

        val title = intent.getStringExtra("news_title")//获取传入的新闻标题
        val content = intent.getStringExtra("news_content")//获取传入的新闻内容
/*        if (title != null && content != null) {
            val fragment = NewsContentFragment()
            fragment.refresh(title, content)//刷新NewsContentFragment界面
        }*/
    }
}