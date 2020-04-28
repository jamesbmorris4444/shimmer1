package com.fullsekurity.shimmer

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.facebook.shimmer.ShimmerFrameLayout
import com.google.android.flexbox.FlexDirection
import com.google.android.flexbox.FlexboxLayoutManager
import com.google.android.flexbox.JustifyContent


class DataActivity : AppCompatActivity() {
    private var mShimmerViewContainer: ShimmerFrameLayout? = null
    private val textArr = arrayOf(
        "dev2qa.com",
        "is",
        "a very good",
        "android example website",
        "there are",
        "a lot of",
        "android, java examples"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flexbox_layout)
        //mShimmerViewContainer = findViewById(R.id.shimmer_view_container)

        val recyclerView = findViewById<RecyclerView>(R.id.flex_box_recycler_view)
        val flexboxLayoutManager = FlexboxLayoutManager(applicationContext)
        flexboxLayoutManager.flexDirection = FlexDirection.ROW
        flexboxLayoutManager.justifyContent = JustifyContent.SPACE_AROUND
        recyclerView.layoutManager = flexboxLayoutManager
        val viewAdapter = ViewAdapter(initViewItemDtoList())
        recyclerView.adapter = viewAdapter
    }

    private fun initViewItemDtoList(): List<ViewItemDTO> {
        val ret: MutableList<ViewItemDTO> = mutableListOf()
        for (i in textArr.indices) {
            val itemDto = ViewItemDTO()
            itemDto.text = textArr[i]
            Log.d("JIMX", "TEXT=" + itemDto.text)
            ret.add(itemDto)
        }
        return ret
    }

    public override fun onResume() {
        super.onResume()
        //mShimmerViewContainer!!.startShimmerAnimation()
    }

    override fun onPause() {
        //mShimmerViewContainer!!.stopShimmerAnimation()
        super.onPause()
    }
}
