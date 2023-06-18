package com.mozhimen.study_basic_unit2.recyclerview

import com.mozhimen.study_basic_unit2.R

/**
 * @ClassName Datasource
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/6/18 14:02
 * @Version 1.0
 */
class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation3),
            Affirmation(R.string.affirmation4),
            Affirmation(R.string.affirmation5),
            Affirmation(R.string.affirmation6),
            Affirmation(R.string.affirmation7),
            Affirmation(R.string.affirmation8),
            Affirmation(R.string.affirmation9),
            Affirmation(R.string.affirmation10)
        )
    }

    fun loadAffirmation2s(): List<Affirmation2> {
        return listOf(
            Affirmation2(R.string.affirmation1, R.drawable.image1),
            Affirmation2(R.string.affirmation2, R.drawable.image2),
            Affirmation2(R.string.affirmation3, R.drawable.image3),
            Affirmation2(R.string.affirmation4, R.drawable.image4),
            Affirmation2(R.string.affirmation5, R.drawable.image5),
            Affirmation2(R.string.affirmation6, R.drawable.image6),
            Affirmation2(R.string.affirmation7, R.drawable.image7),
            Affirmation2(R.string.affirmation8, R.drawable.image8),
            Affirmation2(R.string.affirmation9, R.drawable.image9),
            Affirmation2(R.string.affirmation10, R.drawable.image10)
        )
    }
}