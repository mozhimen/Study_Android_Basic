package com.mozhimen.study_basic_unit2

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.mozhimen.study_basic_unit2.TipCalculateActivity
import org.hamcrest.CoreMatchers
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @ClassName CalculatorTests
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2023/6/16 17:36
 * @Version 1.0
 */
@RunWith(AndroidJUnit4::class)
class CalculatorTests {
    @get:Rule
    val activity = ActivityScenarioRule(TipCalculateActivity::class.java)

    @Test
    fun calculate_20_percent_tip() {
        onView(withId(R.id.tip_cost_of_service_edit_text))
            .perform(typeText("50.00"))
            .perform(ViewActions.closeSoftKeyboard())
        onView(withId(R.id.tip_calculate_button))
            .perform(click())
        onView(withId(R.id.tip_result))
            .check(matches(withText(CoreMatchers.containsString("10.00"))))
    }
}