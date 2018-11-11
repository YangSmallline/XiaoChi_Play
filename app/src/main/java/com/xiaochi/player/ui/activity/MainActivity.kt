package com.xiaochi.player.ui.activity

import android.support.v7.widget.Toolbar
import android.widget.Toolbar
import com.xiaochi.player.R
import com.xiaochi.player.R.id.bottomBar
import com.xiaochi.player.base.BaseActivity
import com.xiaochi.player.util.FragmentUtil
import com.xiaochi.player.util.ToolBarManager
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.find
import java.nio.file.Files.find

class MainActivity : BaseActivity(),ToolBarManager {
    //惰性加载
    override val toolbar by lazy { find<Toolbar>(R.id.toolbar) }
    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initData() {
        initMainToolBar()
    }

    override fun initListener() {
        //设置tab切换监听
        bottomBar.setOnTabSelectListener{
//            it 代表参数tabId
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.container,FragmentUtil.fragmentUtil.getFragment(it),it.toString())
            transaction.commit()
        }
    }
}
