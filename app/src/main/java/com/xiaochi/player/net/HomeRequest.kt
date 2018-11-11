package com.xiaochi.player.net

import com.xiaochi.player.model.bean.HomeItemBean
import com.xiaochi.player.util.URLProviderUtils


/**
 * ClassName:HomeRequest
 * Description:首页数据请求类
 */
class HomeRequest(type:Int,offset:Int,handler:ResponseHandler<List<HomeItemBean>>):
        MRequest<List<HomeItemBean>>(type,URLProviderUtils.getHomeUrl(offset,20),handler){

}