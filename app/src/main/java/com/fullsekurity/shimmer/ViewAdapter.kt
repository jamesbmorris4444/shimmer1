package com.fullsekurity.shimmer

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ViewAdapter(private val itemDtoList: List<ViewItemDTO>) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Log.d("JIMX", "IIIIeeeeeeeeeeeee")
        val itemView: View = LayoutInflater.from(parent.context).inflate(R.layout.activity_flexbox_layout_recycler_view_item, parent, false)
        val textItem = itemView.findViewById(R.id.flex_box_recycler_view_text_item) as TextView
        textItem.setOnClickListener { view ->
            Toast.makeText(
                view.context,
                "You clicked text : " + textItem.text,
                Toast.LENGTH_SHORT
            ).show()
        }
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemDto: ViewItemDTO = itemDtoList[position]
        // Set item image resource id.
        // holder.getImageItem().setImageResource(itemDto.getImageId());
        // Set item text.
        Log.d("JIMX", "IIIIaaaaaaa=" + itemDto.text)
        holder.textItem.text = itemDto.text
    }

    override fun getItemCount(): Int {
        return itemDtoList.size
    }
}