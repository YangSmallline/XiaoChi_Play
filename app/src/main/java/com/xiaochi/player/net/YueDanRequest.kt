package com.xiaochi.player.net

import com.xiaochi.player.model.bean.YueDanBean
import com.xiaochi.player.util.URLProviderUtils


/**
 * ClassName:YueDanRequest
 * Description:悦单界面网络请求request
 */
class YueDanRequest(type:Int,offset:Int,handler:ResponseHandler<YueDanBean>)
    : MRequest<YueDanBean>(type,URLProviderUtils.getYueDanUrl(offset,20),handler) {
}