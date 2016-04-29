package uk.co.breaktek.cratemate.features.splash;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

import uk.co.breaktek.cratemate.mvp.ActivityPresenter;

/**
 * Chris Shotton (voidbreaktek@gmail.com)
 */
@Singleton
public class SplashPresenter implements ActivityPresenter<SplashView> {
    public static final String TAG = SplashPresenter.class.getSimpleName();

    private SplashView mView;

    @Inject
    public SplashPresenter() {
        // Empty constructor with @Inject annotation allows Dagger to construct new instances on
        // request without an explicit module @Provides method
    }

    @Override
    public void initialize() {
        Log.d(TAG, "Presenter initialize");
    }

    @Override
    public void bind(SplashView view) {
        this.mView = view;
    }

    @Override
    public void resume() {
        Log.d(TAG, "Presenter resume");
    }

    @Override
    public void pause() {

    }

    @Override
    public void destroy() {

    }
}
