package uk.co.breaktek.cratemate;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import uk.co.breaktek.cratemate.features.splash.SplashActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Chris Shotton (voidbreaktek@gmail.com)
 */
public class TestSplashActivity {
    @Rule
    public ActivityTestRule<SplashActivity> mActivityRule = new ActivityTestRule<>(SplashActivity.class);

    @Test
    public void testAppWelcomeShown() {
        Intent intent = new Intent();
        mActivityRule.launchActivity(intent);
        onView(withText(R.string.activity_splash_welcome_label)).check(matches(isDisplayed()));
    }
}
