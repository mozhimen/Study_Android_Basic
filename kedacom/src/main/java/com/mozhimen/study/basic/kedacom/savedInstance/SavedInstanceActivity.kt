package com.mozhimen.study.basic.kedacom.savedInstance

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.mozhimen.study.basic.kedacom.databinding.ActivityRecyclerFirstBinding

class SavedInstanceActivity : AppCompatActivity() {
    val tag = "recycler"
    private lateinit var firstBinding: ActivityRecyclerFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        firstBinding = ActivityRecyclerFirstBinding.inflate(layoutInflater)
        setContentView(firstBinding.root)

        if (savedInstanceState != null) {
            val tempData = savedInstanceState.getString("data_key")
            Log.d(tag, tempData ?: "")
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val tempData = "Something you just typed"
        outState.putString("data_key", tempData)
    }
}