package com.mozhimen.study.basic.kedacom.demos.talk

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.mozhimen.study.basic.kedacom.databinding.ActivityTalkBinding

class TalkActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var talkBinding: ActivityTalkBinding

    private lateinit var adapter: MsgAdapter

    private val msgList = ArrayList<Msg>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        talkBinding = ActivityTalkBinding.inflate(layoutInflater)
        setContentView(talkBinding.root)

        initMsg()
        val layoutManager = LinearLayoutManager(this)
        talkBinding.talkRecycler.layoutManager = layoutManager
        if (!::adapter.isInitialized) {
            adapter = MsgAdapter(msgList)
        }
        talkBinding.talkRecycler.adapter = adapter
        talkBinding.talkSend.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            talkBinding.talkSend -> {
                val content = talkBinding.talkInputText.text.toString()
                if (content.isNotEmpty()) {
                    val msg = Msg(content, Msg.TYPE_SEND)
                    msgList.add(msg)
                    adapter.notifyItemInserted(msgList.size - 1)//当有新消息时刷新Recycler中的显示
                    talkBinding.talkRecycler.scrollToPosition(msgList.size - 1)//将RecyclerView定位到最后一行
                    talkBinding.talkInputText.setText("")//清空输入框
                }
            }
        }
    }

    private fun initMsg() {
        val msg1 = Msg("Hello guy", Msg.TYPE_RECEIVED)
        val msg2 = Msg("Hello,Who is that", Msg.TYPE_SEND)
        val msg3 = Msg("This is Tom. Nice to meet you. ", Msg.TYPE_RECEIVED)
        msgList.apply {
            add(msg1)
            add(msg2)
            add(msg3)
        }
    }
}