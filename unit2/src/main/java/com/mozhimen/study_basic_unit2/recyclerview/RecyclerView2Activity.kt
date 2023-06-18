package com.mozhimen.study_basic_unit2.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.mozhimen.study_basic_unit2.R
import com.mozhimen.study_basic_unit2.recyclerview.adapter.Item2Adapter
import com.mozhimen.study_basic_unit2.recyclerview.adapter.ItemAdapter

class RecyclerView2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view2)

        // Initialize data.
        val myDataset = Datasource().loadAffirmation2s()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view2)
        recyclerView.adapter = Item2Adapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)
    }
}