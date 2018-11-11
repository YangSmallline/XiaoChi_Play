package com.xiaochi.player.adapter

import android.content.Context
import com.xiaochi.player.base.BaseListAdapter
import com.xiaochi.player.model.bean.HomeItemBean
import com.xiaochi.player.widget.HomeItemView


/**
 * ClassName:HomeAdapter
 * Description:
 */
class HomeAdapter : BaseListAdapter<HomeItemBean, HomeItemView>() {
    override fun refreshItemView(itemView: HomeItemView, data: HomeItemBean) {
        itemView.setData(data)
    }

    override fun getItemView(context: Context?): HomeItemView {

        return HomeItemView(context)
    }
}