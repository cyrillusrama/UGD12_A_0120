package com.example.ugd12_a_0120;


import androidx.test.espresso.DataInteraction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import static androidx.test.InstrumentationRegistry.getInstrumentation;
import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;

import com.example.ugd12_a_0120.R;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class RandomActivityTest0120 {

    @Rule
    public ActivityTestRule<RandomActivity> mActivityTestRule = new ActivityTestRule<>(RandomActivity.class);

    @Test
    public void randomActivityTest0120() {
        ViewInteraction materialButton = onView(
                allOf(withId(R.id.btn_save), withText("Simpan"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        materialButton.perform(click());

        ViewInteraction textInputEditText = onView(
                allOf(withId(R.id.etEmail),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_email),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText.perform(replaceText("Rama"), closeSoftKeyboard());

        ViewInteraction materialButton2 = onView(
                allOf(withId(R.id.btn_save), withText("Simpan"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        materialButton2.perform(click());

        ViewInteraction textInputEditText2 = onView(
                allOf(withId(R.id.etEmail), withText("Rama"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_email),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText2.perform(click());

        ViewInteraction textInputEditText3 = onView(
                allOf(withId(R.id.etEmail), withText("Rama"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_email),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText3.perform(replaceText("Rama@gmail.com"));

        ViewInteraction textInputEditText4 = onView(
                allOf(withId(R.id.etEmail), withText("Rama@gmail.com"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_email),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText4.perform(closeSoftKeyboard());

        ViewInteraction materialButton3 = onView(
                allOf(withId(R.id.btn_save), withText("Simpan"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        materialButton3.perform(click());

        ViewInteraction textInputEditText5 = onView(
                allOf(withId(R.id.etPassword),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_password),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText5.perform(replaceText("rama"), closeSoftKeyboard());

        ViewInteraction materialButton4 = onView(
                allOf(withId(R.id.btn_save), withText("Simpan"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        materialButton4.perform(click());

        ViewInteraction textInputEditText6 = onView(
                allOf(withId(R.id.etPassword), withText("rama"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_password),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText6.perform(replaceText("rama123"));

        ViewInteraction textInputEditText7 = onView(
                allOf(withId(R.id.etPassword), withText("rama123"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_password),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText7.perform(closeSoftKeyboard());

        ViewInteraction materialButton5 = onView(
                allOf(withId(R.id.btn_save), withText("Simpan"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        materialButton5.perform(click());

        ViewInteraction textInputEditText8 = onView(
                allOf(withId(R.id.etKotaAsal),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_kotaAsal),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText8.perform(replaceText("Mgl"), closeSoftKeyboard());

        ViewInteraction materialButton6 = onView(
                allOf(withId(R.id.btn_save), withText("Simpan"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        materialButton6.perform(click());

        ViewInteraction textInputEditText9 = onView(
                allOf(withId(R.id.etKotaAsal), withText("Mgl"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_kotaAsal),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText9.perform(replaceText("Mgl Kotabunga"));

        ViewInteraction textInputEditText10 = onView(
                allOf(withId(R.id.etKotaAsal), withText("Mgl Kotabunga"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.layout_kotaAsal),
                                        0),
                                1),
                        isDisplayed()));
        textInputEditText10.perform(closeSoftKeyboard());

        ViewInteraction materialButton7 = onView(
                allOf(withId(R.id.btn_save), withText("Simpan"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        materialButton7.perform(click());
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
