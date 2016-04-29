package uk.co.breaktek.cratemate.di.components.activity;

import dagger.Subcomponent;
import uk.co.breaktek.cratemate.annotation.ActivityScope;
import uk.co.breaktek.cratemate.di.modules.activity.SplashModule;
import uk.co.breaktek.cratemate.features.splash.SplashActivity;

/**
 * Dagger2 component for Splash screen
 * <p/>
 * Chris Shotton (voidbreaktek@gmail.com)
 */
@ActivityScope
@Subcomponent(modules = {SplashModule.class})
public interface SplashComponent extends ActivityComponent {
    void inject(SplashActivity activity);
}
