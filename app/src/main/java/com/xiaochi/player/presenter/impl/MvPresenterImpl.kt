package com.xiaochi.player.presenter.impl

import com.xiaochi.player.model.bean.MvAreaBean
import com.xiaochi.player.net.MvAreaRequest
import com.xiaochi.player.net.ResponseHandler
import com.xiaochi.player.presenter.interf.MvPresenter
import com.xiaochi.player.view.MvView


/**
 * ClassName:MvPresenterImpl
 * Description:
 */
class MvPresenterImpl(var mvView:MvView):MvPresenter, ResponseHandler<List<MvAreaBean>> {
    override fun onError(type: Int, msg: String?) {
        mvView.onError(msg)
    }

    override fun onSuccess(type: Int, result: List<MvAreaBean>) {
        mvView.onSuccess(result)
    }

    /**
     * 加载区域数据
     */
    override fun loadDatas() {
        MvAreaRequest(this).excute()
    }
}