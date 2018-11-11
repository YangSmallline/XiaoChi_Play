package com.xiaochi.player.ui.fragment

import com.xiaochi.player.adapter.HomeAdapter
import com.xiaochi.player.base.BaseListAdapter
import com.xiaochi.player.base.BaseListFragment
import com.xiaochi.player.base.BaseListPresenter
import com.xiaochi.player.model.bean.HomeItemBean
import com.xiaochi.player.presenter.impl.HomePresenterImpl
import com.xiaochi.player.widget.HomeItemView


/**
 * ClassName:HomeFragment
 * Description:
 */
class HomeFragment : BaseListFragment<List<HomeItemBean>, HomeItemBean, HomeItemView>() {
    override fun getSpecialAdapter(): BaseListAdapter<HomeItemBean, HomeItemView> {
        return HomeAdapter()
    }

    override fun getSpecialPresenter(): BaseListPresenter {
        return HomePresenterImpl(this)
    }

    override fun getList(response: List<HomeItemBean>?): List<HomeItemBean>? {
        return response
    }

    override fun onDestroyView() {
        super.onDestroyView()
        //解绑presenter
        presenter.destoryView()
    }
}