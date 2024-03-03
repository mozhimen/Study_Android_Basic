package com.mozhimen.study.basic.kedacom.rv

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mozhimen.basick.utilk.bases.IUtilK
import com.mozhimen.study.basic.kedacom.R
import com.mozhimen.study.basic.kedacom.demos.fruit.Fruit

class RecyclerViewAdapter(private val fruitList: List<Fruit>) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>(), IUtilK {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val fruitImage: ImageView = view.findViewById(R.id.fruit_recyclerview_image)
        val fruitName: TextView = view.findViewById(R.id.fruit_recyclerview_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_fruit_recyclerview, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val fruit = fruitList[position]
        holder.fruitImage.setImageResource(fruit.imageId)
        holder.fruitName.text = fruit.name
        holder.itemView.setOnClickListener {
            val bindingAdapterPosition = holder.bindingAdapterPosition
            Log.d(TAG, bindingAdapterPosition.toString())
        }
        holder.fruitImage.setOnClickListener {
            val bindingAdapterPosition = holder.bindingAdapterPosition
            Log.d(TAG, bindingAdapterPosition.toString())
        }
    }

    override fun getItemCount() = fruitList.size
}