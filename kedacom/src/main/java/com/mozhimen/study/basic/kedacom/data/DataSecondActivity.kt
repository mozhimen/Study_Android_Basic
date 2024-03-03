package com.mozhimen.study.basic.kedacom.data

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mozhimen.study.basic.kedacom.databinding.ActivityDataSecondBinding

class DataSecondActivity: AppCompatActivity() {
    private lateinit var secondBinding: ActivityDataSecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        secondBinding= ActivityDataSecondBinding.inflate(layoutInflater)
        setContentView(secondBinding.root)

        secondBinding.secondReturn.setOnClickListener {
            val intent= Intent()
            intent.putExtra("data_return","Hello MainActivity")
            setResult(RESULT_OK,intent)
            finish()
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        super.onBackPressed()
        val intent=Intent()
        intent.putExtra("data_return","Hello MainActivity")
        setResult(RESULT_OK,intent)
        finish()
    }
}