package com.xiaochi.player.ui.fragment

import android.view.View
import com.xiaochi.player.R
import com.xiaochi.player.adapter.MvPagerAdapter
import com.xiaochi.player.base.BaseFragment
import com.xiaochi.player.model.bean.MvAreaBean
import com.xiaochi.player.presenter.impl.MvPresenterImpl
import com.xiaochi.player.view.MvView
import kotlinx.android.synthetic.main.fragment_mv.*


/**
 * ClassName:HomeFragment
 * Description:
 */
class MvFragment: BaseFragment(), MvView {
    override fun onError(msg: String?) {
        myToast("加载区域数据失败")
    }

    override fun onSuccess(result: List<MvAreaBean>) {
        //在fragment中管理fragment需要用childFragmentManager
        val adapter = MvPagerAdapter(context,result,childFragmentManager)
        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)
    }

    val presenter  by lazy { MvPresenterImpl(this) }
    override fun initView(): View? {
        return View.inflate(context, R.layout.fragment_mv,null)
    }

    override fun initListener() {

    }

    override fun initData() {
        //加载区域数据
        presenter.loadDatas()
    }
}