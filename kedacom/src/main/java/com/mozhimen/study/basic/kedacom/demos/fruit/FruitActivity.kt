package com.mozhimen.study.basic.kedacom.demos.fruit

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.mozhimen.basick.elemk.androidx.appcompat.bases.official.BaseActivity
import com.mozhimen.basick.elemk.androidx.appcompat.bases.viewbinding.BaseActivityVB
import com.mozhimen.study.basic.kedacom.R
import com.mozhimen.study.basic.kedacom.databinding.ActivityFruitBinding
import kotlin.concurrent.thread

class FruitActivity : BaseActivityVB<ActivityFruitBinding>() {

    private val fruits = mutableListOf(
        Fruit("Apple", R.drawable.apple),
        Fruit("Banana", R.drawable.banana), Fruit("Watermelon", R.drawable.watermelon),
        Fruit("Orange", R.drawable.orange), Fruit("Pear", R.drawable.pear),
        Fruit("Grape", R.drawable.grape), Fruit("Pineapple", R.drawable.pineapple),
        Fruit("Strawberry", R.drawable.strawberry), Fruit("Cherry", R.drawable.cherry),
        Fruit("Mango", R.drawable.mango)
    )

    private val fruitList = ArrayList<Fruit>()
    private lateinit var _adapter: FruitAdapter

    override fun initView(savedInstanceState: Bundle?) {
        initFruits()

        setSupportActionBar(vb.toolbar)
        supportActionBar?.let {
            it.setDisplayHomeAsUpEnabled(true)
            it.setHomeAsUpIndicator(R.drawable.ic_menu)
        }

        vb.fab.setOnClickListener {
            Snackbar.make(it, "Data deleted", Snackbar.LENGTH_SHORT)
                .setAction("Undo") {
                    Toast.makeText(this, "Data restored", Toast.LENGTH_SHORT).show()
                }
                .show()
        }

        vb.recyclerView.layoutManager = GridLayoutManager(this, 2)
        vb.recyclerView.adapter = FruitAdapter(this, fruitList).also { _adapter = it }

        vb.swipeRefresh.setColorSchemeResources(android.R.color.black)
        vb.swipeRefresh.setOnRefreshListener {
            refreshFruits(_adapter)
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun refreshFruits(adapter: FruitAdapter) {
        thread {
            Thread.sleep(1000)
            runOnUiThread {
                initFruits()
                adapter.notifyDataSetChanged()
                vb.swipeRefresh.isRefreshing = false
            }
        }
    }

    private fun initFruits() {
        fruitList.clear()
        repeat(20) {
            val index = (0 until fruits.size).random()
            fruitList.add(fruits[index])
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.backup -> {
            }

            R.id.delete -> {
            }

            R.id.settings -> {
            }

            android.R.id.home -> {
                vb.drawerLayout.openDrawer(GravityCompat.START)
            }
        }
        return true
    }
}