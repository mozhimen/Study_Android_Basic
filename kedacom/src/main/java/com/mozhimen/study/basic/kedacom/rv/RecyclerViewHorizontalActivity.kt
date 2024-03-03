package com.mozhimen.study.basic.kedacom.rv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.mozhimen.study.basic.kedacom.R
import com.mozhimen.study.basic.kedacom.databinding.ActivityRecyclerviewBinding
import com.mozhimen.study.basic.kedacom.demos.fruit.Fruit

class RecyclerViewHorizontalActivity:AppCompatActivity() {
    private lateinit var recyclerviewBinding: ActivityRecyclerviewBinding
    private val fruitList = ArrayList<Fruit>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        recyclerviewBinding = ActivityRecyclerviewBinding.inflate(layoutInflater)
        setContentView(recyclerviewBinding.root)

        initFruits()
        val layoutManager= LinearLayoutManager(this)
        layoutManager.orientation=LinearLayoutManager.HORIZONTAL
        recyclerviewBinding.recyclerRecyclerView.layoutManager=layoutManager
        val adapter=RecyclerViewHorizontalAdapter(fruitList)
        recyclerviewBinding.recyclerRecyclerView.adapter=adapter
    }

    private fun initFruits() {
        repeat(2) {
            fruitList.apply {
                add(Fruit("Apple", R.drawable.fruit))
                add(Fruit("Pear", R.drawable.fruit))
                add(Fruit("Banana", R.drawable.fruit))
                add(Fruit("Watermelon", R.drawable.fruit))
                add(Fruit("Orange", R.drawable.fruit))
                add(Fruit("Grape", R.drawable.fruit))
                add(Fruit("Pineapple", R.drawable.fruit))
                add(Fruit("Strawberry", R.drawable.fruit))
                add(Fruit("Cherry", R.drawable.fruit))
                add(Fruit("Mango", R.drawable.fruit))
            }
        }
    }
}