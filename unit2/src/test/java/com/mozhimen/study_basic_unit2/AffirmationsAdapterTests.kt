package com.mozhimen.study_basic_unit2

import android.content.Context
import com.mozhimen.study_basic_unit2.recyclerview.Affirmation2
import com.mozhimen.study_basic_unit2.recyclerview.adapter.Item2Adapter
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

/**
 * @ClassName AffirmationsAdapterTests
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/6/18 16:22
 * @Version 1.0
 */
class AffirmationsAdapterTests {
    private val context = mock(Context::class.java)

    @Test
    fun adapter_size() {
        val data = listOf(
            Affirmation2(R.string.affirmation1, R.drawable.image1),
            Affirmation2(R.string.affirmation2, R.drawable.image2)
        )
        val adapter = Item2Adapter(context, data)

        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }
}