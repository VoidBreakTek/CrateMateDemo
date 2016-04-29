package uk.co.breaktek.cratemate.di.modules.activity;

import dagger.Module;
import dagger.Provides;
import uk.co.breaktek.cratemate.annotation.ActivityScope;
import uk.co.breaktek.cratemate.features.splash.SplashView;

/**
 * Dagger DI module for Splash screen
 * Chris Shotton (voidbreaktek@gmail.com)
 */
@Module
public class SplashModule {
    private SplashView mView;

    public SplashModule(SplashView view){
        this.mView = view;
    }

    @Provides
    @ActivityScope
    SplashView view(){
        return mView;
    }
}
