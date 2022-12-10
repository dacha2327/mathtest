package com.dacha.test

import androidx.core.content.MimeTypeFilter.matches
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.ViewAction
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

class ActivityTest {
    @Rule
    @JvmField
    var rule:ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)



    @Test
    fun simpleDivide(){
        runBlocking {

            Espresso.onView(withId(R.id.num_1)).perform(ViewActions.typeText("6"))
            Espresso.onView(withId(R.id.num_1)).perform(ViewActions.closeSoftKeyboard())
            delay(3000)
            Espresso.onView(withId(R.id.num_2)).perform(ViewActions.typeText("3"))
            Espresso.onView(withId(R.id.num_2)).perform(ViewActions.closeSoftKeyboard())
            delay(3000)
            Espresso.onView(withId(R.id.btn)).perform(ViewActions.click())
            delay(3000)
            Espresso.onView(withId(R.id.tv_result)).check(ViewAssertions.matches(ViewMatchers.withText("2")))
        }
    }
}