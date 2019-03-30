package com.example.myapplication;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.intent.Intents;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class HomepageTest {

    @Rule
    public ActivityTestRule<Homepage> mActivityTestRule = new ActivityTestRule<Homepage>(Homepage.class);

    @Before
    public void setUp() throws Exception {
        Intents.init();
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testElementaryProgrammingLesson1() throws InterruptedException {

        Espresso.onView(withId(R.id.button_ePLesson1)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_ePLesson1)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testElementaryProgrammingLesson2() throws InterruptedException {

        Espresso.onView(withId(R.id.button_ePLesson2)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_ePLesson2)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testElementaryProgrammingLesson3() throws InterruptedException {

        Espresso.onView(withId(R.id.button_ePLesson3)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_ePLesson3)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testSelectionsLesson1() throws InterruptedException {

        Espresso.onView(withId(R.id.button_sLesson1)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_sLesson1)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testSelectionsLesson2() throws InterruptedException {

        Espresso.onView(withId(R.id.button_sLesson2)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_sLesson2)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testSelectionsLesson3() throws InterruptedException {

        Espresso.onView(withId(R.id.button_sLesson3)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_sLesson3)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testFunctionsCharactersStringsLesson1() throws InterruptedException {

        Espresso.onView(withId(R.id.button_fCSLesson1)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_fCSLesson1)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testFunctionsCharactersStringsLesson2() throws InterruptedException {

        Espresso.onView(withId(R.id.button_fCSLesson2)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_fCSLesson2)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testFunctionsCharactersStringsLesson3() throws InterruptedException {

        Espresso.onView(withId(R.id.button_fCSLesson3)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_fCSLesson3)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testFunctionsCharactersStringsLesson4() throws InterruptedException {

        Espresso.onView(withId(R.id.button_fCSLesson4)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_fCSLesson4)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testLoopsLesson1() throws InterruptedException {

        Espresso.onView(withId(R.id.button_while)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_while)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testLoopsLesson2() throws InterruptedException {

        Espresso.onView(withId(R.id.button_for)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_for)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testLoopsLesson3() throws InterruptedException {

        Espresso.onView(withId(R.id.button_do)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_do)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testMethodsLesson1() throws InterruptedException {

        Espresso.onView(withId(R.id.button_mLesson1)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_mLesson1)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testMethodsLesson2() throws InterruptedException {

        Espresso.onView(withId(R.id.button_mLesson2)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_mLesson2)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testSingleDimensionalArrays1() throws InterruptedException {

        Espresso.onView(withId(R.id.button_aLesson1)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_aLesson1)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    // test: clicking lesson button takes you to the LessonActivity
    @Test
    public void testSingleDimensionalArrays2() throws InterruptedException {

        Espresso.onView(withId(R.id.button_aLesson2)).perform(ViewActions.scrollTo());
        Espresso.onView(withId(R.id.button_aLesson2)).perform(click()); // click the next button

        Thread.sleep(500); // idle test to wait for activity to launch before assertion
        intended(hasComponent(LessonActivity.class.getName())); // assert if lesson activity is launched
    }

    @After
    public void tearDown() throws Exception {
        Intents.release();
    }

}