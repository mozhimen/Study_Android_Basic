package com.mozhimen.study_basic_unit2.recyclerview

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * @ClassName Affirmation
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/6/18 14:01
 * @Version 1.0
 */
data class Affirmation(val stringResourceId: Int)

data class Affirmation2(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)