package com.mozhimen.study.basic.kedacom.rv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mozhimen.study.basic.kedacom.R
import com.mozhimen.study.basic.kedacom.demos.fruit.Fruit

class RecyclerViewHorizontalAdapter(private val fruitList: List<Fruit>) :
    RecyclerView.Adapter<RecyclerViewHorizontalAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val fruitImage: ImageView = view.findViewById(R.id.fruit_recyclerview_horizontal_image)
        val fruitName: TextView = view.findViewById(R.id.fruit_recyclerview_horizontal__name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_fruit_recyclerview_horizontal, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val fruit = fruitList[position]
        holder.fruitImage.setImageResource(fruit.imageId)
        holder.fruitName.text = fruit.name
    }

    override fun getItemCount() = fruitList.size
}