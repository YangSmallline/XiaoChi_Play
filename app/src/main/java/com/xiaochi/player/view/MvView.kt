package com.xiaochi.player.view

import com.xiaochi.player.model.bean.MvAreaBean


/**
 * ClassName:MvView
 * Description:
 */
interface MvView {
    fun  onError(msg: String?)
    fun  onSuccess(result: List<MvAreaBean>)
}