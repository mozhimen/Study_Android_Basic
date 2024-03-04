package com.mozhimen.study.basic.material

import android.app.Application
import com.mozhimen.adaptk.dynamic.colors.AdaptKDynamicColors
import com.mozhimen.uicorek.optins.OTheme_ThemeMaterial3DayNoAction

class MainApplication: Application() {

    @OptIn(OTheme_ThemeMaterial3DayNoAction::class)
    override fun onCreate() {
        super.onCreate()

        AdaptKDynamicColors.init(this)
    }
}