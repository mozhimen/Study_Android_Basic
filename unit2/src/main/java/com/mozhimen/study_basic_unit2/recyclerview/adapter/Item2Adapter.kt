package com.mozhimen.study_basic_unit2.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mozhimen.study_basic_unit2.R
import com.mozhimen.study_basic_unit2.recyclerview.Affirmation
import com.mozhimen.study_basic_unit2.recyclerview.Affirmation2

/**
 * @ClassName ItemAdapter
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/6/18 15:36
 * @Version 1.0
 */

/**
 * Adapter for the [RecyclerView] in [MainActivity]. Displays [Affirmation] data object.
 */
class Item2Adapter(
    private val context: Context,
    private val dataset: List<Affirmation2>
) : RecyclerView.Adapter<Item2Adapter.ItemViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just an Affirmation object.
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item2_title)
        val imageView: ImageView = view.findViewById(R.id.item2_image)
    }

    /**
     * Create new views (invoked by the layout manager)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item2, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    /**
     * Return the size of your dataset (invoked by the layout manager)
     */
    override fun getItemCount() = dataset.size
}