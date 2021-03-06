package com.junlong0716.module.b

import android.util.Log
import com.junlong0716.module.common.ApplicationImpl
import com.junlong0716.module.common.BaseApplication

/**
 *@author: EdsionLi
 *@description:
 *@date: Created in 2018/6/13 下午1:04
 *@modified by:
 */
class ModuleMainBApp : ApplicationImpl {
    private lateinit var baseApplication: BaseApplication

    companion object {
        private var instance: ModuleMainBApp? = null
        fun instance() = instance!!
    }

    override fun onCreate(baseApplication: BaseApplication) {
        Log.d("ModuleA 初始化！","ModuleA 初始化！")
    }
}