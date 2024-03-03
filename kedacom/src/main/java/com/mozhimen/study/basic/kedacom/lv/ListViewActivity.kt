package com.mozhimen.study.basic.kedacom.lv

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.mozhimen.study.basic.kedacom.R
import com.mozhimen.study.basic.kedacom.databinding.ActivityListviewFruitBinding
import com.mozhimen.study.basic.kedacom.demos.fruit.Fruit

class ListViewActivity:AppCompatActivity() {
    private val fruitList=ArrayList<Fruit>()
    lateinit var fruitBinding: ActivityListviewFruitBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fruitBinding= ActivityListviewFruitBinding.inflate(layoutInflater)
        setContentView(fruitBinding.root)

        initFruits()
        val adapter=ListViewAdapter(this, R.layout.item_fruit_listview,fruitList)
        fruitBinding.fruitListView.adapter=adapter
        fruitBinding.fruitListView.setOnItemClickListener { _, _, position, _ ->
            val fruit=fruitList[position]
            Toast.makeText(this,fruit.name,Toast.LENGTH_SHORT).show()
        }
    }

    private fun initFruits() {
        repeat(2){
            fruitList.apply {
                add(Fruit("Apple",R.drawable.fruit))
                add(Fruit("Pear",R.drawable.fruit))
                add(Fruit("Banana",R.drawable.fruit))
                add(Fruit("Watermelon",R.drawable.fruit))
                add(Fruit("Orange",R.drawable.fruit))
                add(Fruit("Grape",R.drawable.fruit))
                add(Fruit("Pineapple",R.drawable.fruit))
                add(Fruit("Strawberry",R.drawable.fruit))
                add(Fruit("Cherry",R.drawable.fruit))
                add(Fruit("Mango",R.drawable.fruit))
            }
        }
    }
}