package uk.co.breaktek.cratemate.features.home;

import android.app.Activity;
import android.os.Bundle;

import uk.co.breaktek.cratemate.R;

/**
 * Home screen Activity
 * <p/>
 * Chris Shotton (voidbreaktek@gmail.com)
 */
public class HomeActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_home);
    }
}
