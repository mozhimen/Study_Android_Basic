package com.mozhimen.study.basic.kedacom.demos.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mozhimen.study.basic.kedacom.R
import com.mozhimen.study.basic.kedacom.databinding.FragmentNewsTitleBinding

class NewsTitleFragment : Fragment() {
    private var isTwoPane = false

    private var _titleBinding:FragmentNewsTitleBinding?=null
    private val titleBinding get() = _titleBinding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _titleBinding= FragmentNewsTitleBinding.inflate(inflater,container,false)
        return titleBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        isTwoPane = activity?.findViewById<View>(R.id.news_content_fragment) != null

        val layoutManager=LinearLayoutManager(activity)
        titleBinding.newsTitleRecyclerview.layoutManager=layoutManager
        val adapter=NewsAdapter(getNews())
        titleBinding.newsTitleRecyclerview.adapter=adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        _titleBinding=null
    }

    private fun getNews():List<News>{
        val newsList=ArrayList<News>()
        for (i in 1..50){
            val news  = News("This is title $i",getRandomLength("This is news content $i. "))
        }
        return newsList
    }

    private fun getRandomLength(str:String):String=str*(1..20).random()

    operator fun String.times(n:Int)=repeat(n)

    inner class NewsAdapter(private val newsList: List<News>) :
        RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

        inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val newsTitle: TextView = view.findViewById(R.id.news_content_newsTitle)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
            val holder=ViewHolder(view)
            holder.itemView.setOnClickListener {
                val news=newsList[holder.absoluteAdapterPosition]
                if(isTwoPane){
                    //如果双页,刷新NewsContent
                    val fragment= NewsContentFragment()
                    fragment.refresh(news.title,news.content)
                }else{
                    //如果单页,则直接启动NewsContentActivity
                    NewsContentActivity.actionStart(parent.context, news.title, news.content)
                }
            }
            return holder
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val news=newsList[position]
            holder.newsTitle.text=news.title
        }

        override fun getItemCount()=newsList.size
    }
}