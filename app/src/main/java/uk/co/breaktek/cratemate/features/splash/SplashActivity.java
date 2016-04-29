package uk.co.breaktek.cratemate.features.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import javax.inject.Inject;

import butterknife.ButterKnife;
import uk.co.breaktek.cratemate.CrateMateApplication;
import uk.co.breaktek.cratemate.R;
import uk.co.breaktek.cratemate.di.base.DaggerActivity;
import uk.co.breaktek.cratemate.di.components.activity.ActivityComponent;
import uk.co.breaktek.cratemate.di.components.activity.SplashComponent;
import uk.co.breaktek.cratemate.di.modules.activity.SplashModule;
import uk.co.breaktek.cratemate.features.home.HomeActivity;

public class SplashActivity extends DaggerActivity implements SplashView {
    @Inject SplashPresenter mPresenter;
    private final Handler mHandler = new Handler();
    private final Runnable mHomeScreenRunnable = new Runnable() {
        @Override
        public void run() {
            startHomeActivity();
            finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_splash);
        ButterKnife.bind(this);
        mPresenter.bind(this);
        mPresenter.initialize();
    }

    @Override
    protected ActivityComponent setupActivityComponent() {
        // Here the Activity's SubComponent is constructed with the base Application Component as
        // it's parent. This allows access to the global dependencies supplied by the Application
        // Component's modules.
        SplashComponent component = CrateMateApplication.get(this)
                .getAppComponent()
                .with(new SplashModule(this));

        component.inject(this);
        return component;
    }

    @Override
    public void showHomeScreen(int delayMs) {
        mHandler.postDelayed(mHomeScreenRunnable, delayMs);
    }

    private void startHomeActivity(){
        startActivity(new Intent(this, HomeActivity.class));
    }

    @Override
    protected void onStop() {
        super.onStop();
        mHandler.removeCallbacks(mHomeScreenRunnable);
    }
}
