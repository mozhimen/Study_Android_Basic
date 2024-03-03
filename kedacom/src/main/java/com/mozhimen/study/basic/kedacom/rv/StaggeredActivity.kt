package com.mozhimen.study.basic.kedacom.rv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.mozhimen.study.basic.kedacom.R
import com.mozhimen.study.basic.kedacom.databinding.ActivityRecyclerviewBinding
import com.mozhimen.study.basic.kedacom.demos.fruit.Fruit
import java.lang.StringBuilder

class StaggeredActivity : AppCompatActivity() {
    private lateinit var recyclerviewBinding: ActivityRecyclerviewBinding
    private val fruitList = ArrayList<Fruit>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        recyclerviewBinding = ActivityRecyclerviewBinding.inflate(layoutInflater)
        setContentView(recyclerviewBinding.root)

        initFruits()
        val layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        recyclerviewBinding.recyclerRecyclerView.layoutManager = layoutManager
        val adapter = StaggeredAdapter(fruitList)
        recyclerviewBinding.recyclerRecyclerView.adapter = adapter
    }

    private fun initFruits() {
        repeat(2) {
            fruitList.apply {
                add(Fruit(getRandomLength("Apple"), R.drawable.fruit))
                add(Fruit(getRandomLength("Pear"), R.drawable.fruit))
                add(Fruit(getRandomLength("Banana"), R.drawable.fruit))
                add(Fruit(getRandomLength("Watermelon"), R.drawable.fruit))
                add(Fruit(getRandomLength("Orange"), R.drawable.fruit))
                add(Fruit(getRandomLength("Grape"), R.drawable.fruit))
                add(Fruit(getRandomLength("Pineapple"), R.drawable.fruit))
                add(Fruit(getRandomLength("Strawberry"), R.drawable.fruit))
                add(Fruit(getRandomLength("Cherry"), R.drawable.fruit))
                add(Fruit(getRandomLength("Mango"), R.drawable.fruit))
            }
        }
    }

    private fun getRandomLength(str: String): String {
        val n = (0..10).random()
        return with(StringBuilder())
        {
            repeat(n) {
                append(str)
            }
            toString()
        }
    }
}