package com.mozhimen.study.basic.kedacom.demos.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mozhimen.study.basic.kedacom.databinding.FragmentNewsContentBinding

class NewsContentFragment : Fragment() {
    private var _newsBinding:FragmentNewsContentBinding?=null
    private val newsBinding get() = _newsBinding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _newsBinding= FragmentNewsContentBinding.inflate(inflater,container,false)
        return newsBinding.root
    }

    fun refresh(title: String, content: String) {
/*        newsBinding.newsContentLayout.visibility=View.VISIBLE
        newsBinding.newsNewsTitle.text=title//刷新标题
        newsBinding.newsContent.text=content//刷新新闻内容*/
    }

    override fun onDestroy() {
        super.onDestroy()
        _newsBinding?.let { _newsBinding=null }
    }
}