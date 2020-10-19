package com.first.polygonteam.interview;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.content.Context;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.assertEquals;

/**
 * Created by vmoro on 19.08.2017.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class ConvertActivityTest {

    private String mStringToBetyped;

    @Rule
    public ActivityScenarioRule mActivityRule = new ActivityScenarioRule<>(MainActivity.class);

    @Before
    public void initValidString() {
        // Specify a valid string.
        mStringToBetyped = "5";
    }

    @Test
    public void ConvertActivity_toFahrenheitButton_Test() {
        // Type text and then press the button.
        onView(withId(R.id.celsiusValue))
                .perform(typeText(mStringToBetyped));
        onView(withId(R.id.toFahrenheitButton)).perform(click());

        // Check that the text was changed.
        onView(withId(R.id.celsiusValue))
                .check(matches(withText(mStringToBetyped)));

        onView(withId(R.id.fahrenheitValue))
                .check(matches(withText("41.00"))); // формат вывода два знака после запятой

    }

    @Test
    public void AppContext_Test() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getContext();

        assertEquals("ru.geekbrains.converter", appContext.getPackageName());
    }

}
