package com.fullsekurity.shimmer

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var textItem: TextView = itemView.findViewById(R.id.flex_box_recycler_view_text_item)
}