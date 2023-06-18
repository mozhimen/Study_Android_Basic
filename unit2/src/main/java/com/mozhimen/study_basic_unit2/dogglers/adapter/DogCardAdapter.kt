/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.mozhimen.study_basic_unit2.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mozhimen.study_basic_unit2.R
import com.mozhimen.study_basic_unit2.dogglers.const.Layout
import com.mozhimen.study_basic_unit2.dogglers.data.DataSource
import com.mozhimen.study_basic_unit2.dogglers.model.Dog

/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class DogCardAdapter(
    private val context: Context?,
    private val layout: Int
) : RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {

    // TODO: Initialize the data using the List found in data/DataSource
    private val dataSets: List<Dog> by lazy { DataSource.dogs }

    /**
     * Initialize view elements
     */
    class DogCardViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        // TODO: Declare and initialize all of the list item UI components
        val img: ImageView = view.findViewById(R.id.grid_item_img)
        val name: TextView = view.findViewById(R.id.grid_item_name)
        val age: TextView = view.findViewById(R.id.grid_item_age)
        val hobbies: TextView = view.findViewById(R.id.grid_item_hobbies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        // TODO: Use a conditional to determine the layout type and set it accordingly.
        //  if the layout variable is Layout.GRID the grid list item should be used. Otherwise the
        //  the vertical/horizontal list item should be used.
        val layoutId = when (layout) {
            Layout.GRID -> R.layout.grid_list_item
            else -> R.layout.vertical_horizontal_list_item
        }
        // TODO Inflate the layout
        val adapterLayout = LayoutInflater.from(parent.context).inflate(layoutId, parent, false)

        // TODO: Null should not be passed into the view holder. This should be updated to reflect
        //  the inflated layout.
        return DogCardViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int = dataSets.size // TODO: return the size of the data set instead of 0

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        // TODO: Get the data at the current position
        val item = dataSets[position]

        // TODO: Set the image resource for the current dog
        holder.img.setImageResource(item.imageResourceId)

        // TODO: Set the text for the current dog's name
        holder.name.text = item.name

        // TODO: Set the text for the current dog's age
        val resources = context?.resources
        holder.age.text = resources?.getString(R.string.dog_age, item.age)

        // TODO: Set the text for the current dog's hobbies by passing the hobbies to the
        //  R.string.dog_hobbies string constant.
        //  Passing an argument to the string resource looks like:
        //  resources?.getString(R.string.dog_hobbies, dog.hobbies)
        holder.hobbies.text = resources?.getString(R.string.dog_hobbies, item.hobbies)
    }
}
