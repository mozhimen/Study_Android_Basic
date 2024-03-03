package com.mozhimen.study.basic.kedacom.rv

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mozhimen.study.basic.kedacom.R
import com.mozhimen.study.basic.kedacom.demos.fruit.Fruit

class StaggeredAdapter(private val fruitList: List<Fruit>) :
    RecyclerView.Adapter<StaggeredAdapter.ViewHolder>() {
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val fruitImage: ImageView = view.findViewById(R.id.fruit_staggered_image)
        val fruitName: TextView = view.findViewById(R.id.fruit_staggered_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_fruit_staggered, parent, false)
        val viewHolder = ViewHolder(view)
        viewHolder.itemView.setOnClickListener {
            val position = viewHolder.bindingAdapterPosition
            //val fruit = fruitList[position]
            Log.d("main",position.toString())
            /*Toast.makeText(parent.context, "you clicked view ${fruit.name}", Toast.LENGTH_SHORT)
                .show()*/
        }
        viewHolder.fruitImage.setOnClickListener {
            val position = viewHolder.bindingAdapterPosition
            //val fruit = fruitList[position]
            Log.d("main",position.toString())
            /*Toast.makeText(parent.context, "you clicked image ${fruit.name}", Toast.LENGTH_SHORT)
                .show()*/
        }
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val fruit = fruitList[position]
        holder.fruitImage.setImageResource(fruit.imageId)
        holder.fruitName.text = fruit.name
    }

    override fun getItemCount() = fruitList.size
}