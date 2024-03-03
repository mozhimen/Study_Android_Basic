package com.mozhimen.study.basic.kedacom.data

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.mozhimen.study.basic.kedacom.databinding.ActivityDataFirstBinding

class DataFirstActivity : AppCompatActivity() {
    private lateinit var firstBinding: ActivityDataFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        firstBinding = ActivityDataFirstBinding.inflate(layoutInflater)
        setContentView(firstBinding.root)

        firstBinding.firstGotoSecond.setOnClickListener {
            val intent = Intent(this, DataSecondActivity::class.java)
            startActivityForResult(intent, 1)
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when(requestCode){
            1->if (resultCode== RESULT_OK){
                val returnedData=data?.getStringExtra("data_return")
                Toast.makeText(this,returnedData,Toast.LENGTH_SHORT).show()
            }
        }
    }
}