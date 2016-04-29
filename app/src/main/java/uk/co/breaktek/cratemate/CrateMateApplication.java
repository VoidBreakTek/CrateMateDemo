package uk.co.breaktek.cratemate;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;
import android.util.Log;

import uk.co.breaktek.cratemate.di.components.global.ApplicationComponent;
import uk.co.breaktek.cratemate.di.components.global.ApplicationComponentFactory;

/**
 * Base application class
 * <p/>
 * Chris Shotton (voidbreaktek@gmail.com)
 */
public class CrateMateApplication extends Application {
    public static final String TAG = CrateMateApplication.class.getSimpleName();
    private ApplicationComponent mAppComponent;

    public static CrateMateApplication get(Context context) {
        return (CrateMateApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        //Build application appComponent and inject it here so dependencies from it are available
        //Where dependencies are required call .inject(this) in the given class
        Log.d(TAG, "Setup Application Component");
        mAppComponent = ApplicationComponentFactory.create(this);
        getAppComponent().inject(this);
    }

    public ApplicationComponent getAppComponent() {
        return mAppComponent;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
