package com.xiaochi.player.adapter

import android.app.Fragment
import android.app.FragmentManager
import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.xiaochi.player.model.bean.MvAreaBean
import com.xiaochi.player.ui.fragment.MvPagerFragment


/**
 * ClassName:MvPagerAdapter
 * Description:
 */
class MvPagerAdapter(val context:Context,val list:List<MvAreaBean>?,fm: FragmentManager?) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        //第一种数据传递方式
//        val fragment = MvPagerFragment()
        val bundle = Bundle()
        bundle.putString("args",list?.get(position)?.code)
//        fragment.arguments = bundle
        //第二种fragment传递数据方式
        val fragment = Fragment.instantiate(context,MvPagerFragment::class.java.name,bundle)
        return fragment
    }

    override fun getCount(): Int {
        return list?.size?:0//如果不为null返回list.size 为空返回0
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return list?.get(position)?.name
    }
}