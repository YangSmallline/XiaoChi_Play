package com.xiaochi.player.ui.fragment

import com.xiaochi.player.adapter.YueDanAdapter
import com.xiaochi.player.base.BaseListAdapter
import com.xiaochi.player.base.BaseListFragment
import com.xiaochi.player.base.BaseListPresenter
import com.xiaochi.player.model.bean.YueDanBean
import com.xiaochi.player.presenter.impl.YueDanPresenterImpl
import com.xiaochi.player.widget.YueDanItemView


/**
 * ClassName:HomeFragment
 * Description:悦单界面
 */
class YueDanFragment: BaseListFragment<YueDanBean, YueDanBean.PlayListsBean, YueDanItemView>() {
    override fun getSpecialAdapter(): BaseListAdapter<YueDanBean.PlayListsBean, YueDanItemView> {
        return YueDanAdapter()
    }

    override fun getSpecialPresenter(): BaseListPresenter {
        return YueDanPresenterImpl(this)
    }

    override fun getList(response: YueDanBean?): List<YueDanBean.PlayListsBean>? {
        return response?.playLists
    }

}