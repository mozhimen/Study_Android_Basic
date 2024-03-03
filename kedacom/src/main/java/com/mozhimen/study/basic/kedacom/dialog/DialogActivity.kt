package com.mozhimen.study.basic.kedacom.dialog

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mozhimen.study.basic.kedacom.databinding.ActivityDialogBinding

class DialogActivity: AppCompatActivity() {

    private lateinit var dialogBinding: ActivityDialogBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dialogBinding= ActivityDialogBinding.inflate(layoutInflater)
        setContentView(dialogBinding.root)
    }
}