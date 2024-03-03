package com.mozhimen.study.basic.kedacom.net

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mozhimen.study.basic.kedacom.databinding.ActivityHttpurlBinding
import okhttp3.OkHttpClient
import okhttp3.Request
import java.lang.Exception
import java.net.HttpURLConnection
import kotlin.concurrent.thread

/**
 * @ClassName HttpURLActivity
 * @Description TODO
 * @Author mozhimen
 * @Date 2021/4/14 16:16
 * @Version 1.0
 */
class HttpActivity : AppCompatActivity() {

    private lateinit var httpUrlBinding: ActivityHttpurlBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        httpUrlBinding = ActivityHttpurlBinding.inflate(layoutInflater)
        setContentView(httpUrlBinding.root)

        httpUrlBinding.httpUrlSendRequest.setOnClickListener {
            sendRequestWithHttpURLConnection()
        }
    }

    private fun sendRequestWithHttpURLConnection() {
        //开启线程发起的网络请求
        thread {
            val connection: HttpURLConnection? = null
            try {
                /*val response = StringBuilder()
                val url = URL("https://www.baidu.com")
                connection = url.openConnection() as HttpURLConnection
                connection.connectTimeout = 8000
                connection.readTimeout = 8000
                val input = connection.inputStream
                //下面对获取的输入流进行读取
                val reader = BufferedReader(InputStreamReader(input))
                reader.use {
                    reader.forEachLine {
                        response.append(it)
                    }
                }
                showResponse(response.toString())*/
                    //okhttp
                val client = OkHttpClient()
                val request = Request.Builder()
                    .url("https://www.baidu.com")
                    .build()
                val response = client.newCall(request).execute()
                val responseData = response.body?.string()
                if (responseData != null) showResponse(responseData)
            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
                connection?.disconnect()
            }
        }
    }

    private fun showResponse(response: String) {
        runOnUiThread {
            //在这里进行UI操作,将结果显示到界面上
            httpUrlBinding.httpUrlResponseText.text = response
        }
    }
}


