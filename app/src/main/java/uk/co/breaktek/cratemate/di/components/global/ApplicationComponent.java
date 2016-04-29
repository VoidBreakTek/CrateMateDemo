package uk.co.breaktek.cratemate.di.components.global;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import uk.co.breaktek.cratemate.CrateMateApplication;
import uk.co.breaktek.cratemate.annotation.ApplicationContext;
import uk.co.breaktek.cratemate.di.components.activity.SplashComponent;
import uk.co.breaktek.cratemate.di.modules.activity.SplashModule;
import uk.co.breaktek.cratemate.di.modules.global.ApplicationModule;

/**
 * Root application component to be initialized on startup from the base extended Application
 * instance
 * <p/>
 * Chris Shotton (voidbreaktek@gmail.com)
 */
@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    void inject(CrateMateApplication application);

    @ApplicationContext
    Context context();

    SplashComponent with(SplashModule module);

}
