package com.mozhimen.study.basic.kedacom.dialog

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.mozhimen.study.basic.kedacom.databinding.ActivityAlertdialogBinding

class AlertDialogActivity : AppCompatActivity() {

    private lateinit var alertdialogBinding: ActivityAlertdialogBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        alertdialogBinding = ActivityAlertdialogBinding.inflate(layoutInflater)
        setContentView(alertdialogBinding.root)

        alertdialogBinding.alertdialogBtn.setOnClickListener {
            AlertDialog.Builder(this).apply {
                setTitle("This is a Dialog")
                setMessage("Something important")
                setCancelable(false)
                setPositiveButton("OK") { dialog, which ->
                }
                setNegativeButton("Cancel") { dialog, which ->
                }
                show()
            }
        }
    }
}