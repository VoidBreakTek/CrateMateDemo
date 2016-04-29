package uk.co.breaktek.cratemate.di.modules.global;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import uk.co.breaktek.cratemate.CrateMateApplication;
import uk.co.breaktek.cratemate.annotation.ApplicationContext;

/**
 * Dagger module to provide global dependencies
 * <p/>
 * Chris Shotton (voidbreaktek@gmail.com)
 */
@Module
public class ApplicationModule {
    private final CrateMateApplication mApplication;

    public ApplicationModule(CrateMateApplication application) {
        this.mApplication = application;
    }

    @Provides
    @Singleton
    @ApplicationContext
    Context provideApplicationContext() {
        return mApplication;
    }
}
