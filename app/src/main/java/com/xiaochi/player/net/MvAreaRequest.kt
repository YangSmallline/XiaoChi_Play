package com.xiaochi.player.net

import com.xiaochi.player.model.bean.MvAreaBean
import com.xiaochi.player.util.URLProviderUtils


/**
 * ClassName:MvAreaRequest
 * Description:mv区域数据请求
 */
class MvAreaRequest(handler: ResponseHandler<List<MvAreaBean>>)
    : MRequest<List<MvAreaBean>>(0, URLProviderUtils.getMVareaUrl(), handler) {
}