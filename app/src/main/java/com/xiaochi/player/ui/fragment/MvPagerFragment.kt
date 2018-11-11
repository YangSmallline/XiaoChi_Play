package com.xiaochi.player.ui.fragment

import com.xiaochi.player.adapter.MvListAdapter
import com.xiaochi.player.base.BaseListAdapter
import com.xiaochi.player.base.BaseListFragment
import com.xiaochi.player.base.BaseListPresenter
import com.xiaochi.player.model.VideoPlayBean
import com.xiaochi.player.model.bean.MvPagerBean
import com.xiaochi.player.model.bean.VideosBean
import com.xiaochi.player.presenter.impl.MvListPresenterImpl
import com.xiaochi.player.ui.activity.JiecaoVideoPlayerActivity
import com.xiaochi.player.view.MvListView
import com.xiaochi.player.widget.MvItemView
import org.jetbrains.anko.support.v4.startActivity


/**
 * ClassName:MvPagerFragment
 * Description:mv界面每一个页面fragment
 */
class MvPagerFragment: BaseListFragment<MvPagerBean, VideosBean, MvItemView>(), MvListView {
    var code:String? = null
    override fun init() {
        code = arguments.getString("args")
    }
    override fun getSpecialAdapter(): BaseListAdapter<VideosBean, MvItemView> {
        return MvListAdapter()
    }

    override fun getSpecialPresenter(): BaseListPresenter {
        return MvListPresenterImpl(code!!,this)
    }

    override fun getList(response: MvPagerBean?): List<VideosBean>? {
        return response?.videos
    }

    override fun initListener() {
        super.initListener()
        //设置条目点击事件监听函数
        adapter.setMyListener{
            val videoPlayBean = VideoPlayBean(it.id,it.title,it.url)
            //跳转到视频播放界面
            startActivity<JiecaoVideoPlayerActivity>("item" to videoPlayBean)
        }
    }
}