package com.mozhimen.study.basic.kedacom.lv

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.mozhimen.study.basic.kedacom.R
import com.mozhimen.study.basic.kedacom.demos.fruit.Fruit

class ListViewAdapter(activity: Activity, private val resourceId: Int, data: List<Fruit>) :
    ArrayAdapter<Fruit>(activity, resourceId, data) {

    inner class ViewHolder(val fruitImage:ImageView,val fruitName:TextView)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View
        val viewHolder: ViewHolder
        if(convertView== null){
            view=LayoutInflater.from(context).inflate(resourceId, parent, false)
            val fruitImage:ImageView=view.findViewById(R.id.fruit_image)
            val fruitName:TextView=view.findViewById(R.id.fruit_name)
            viewHolder=ViewHolder(fruitImage,fruitName)
            view.tag=viewHolder
        }else{
            view= convertView
            viewHolder=view.tag as ViewHolder
        }
        val fruit = getItem(position)//获取当前项的Fruit实例
        fruit?.let {
            viewHolder.fruitImage.setImageResource(it.imageId)
            viewHolder.fruitName.text = it.name
        }
        return view
    }
}