package com.mozhimen.study_basic_unit2

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.mozhimen.study_basic_unit2.recyclerview.RecyclerViewActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @ClassName AffirmationsListTests
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/6/18 16:13
 * @Version 1.0
 */
@RunWith(AndroidJUnit4::class)
class AffirmationsListTests {
    @get:Rule
    val activity = ActivityScenarioRule(RecyclerViewActivity::class.java)

    @Test
    fun scroll_to_item() {
        onView(withId(R.id.recycler_view)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(9))
        //or
        //onView(withId(R.id.recycler_view)).perform(RecyclerViewActions.scrollTo<RecyclerView.ViewHolder>(withText(R.string.affirmation10)))
        onView(withText(R.string.affirmation10)).check(matches(isDisplayed()))
    }
}