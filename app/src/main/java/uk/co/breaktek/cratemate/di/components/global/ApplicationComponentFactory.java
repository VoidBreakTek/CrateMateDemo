package uk.co.breaktek.cratemate.di.components.global;

import uk.co.breaktek.cratemate.CrateMateApplication;
import uk.co.breaktek.cratemate.di.modules.global.ApplicationModule;

/**
 * Factory class for creating ApplicationComponent instances. If multiple build flavors are used
 * this class can be swapped out in multiple source trees to provide the correct base Application
 * Component with the appropriate modules for that flavor.
 * <p/>
 * Chris Shotton (voidbreaktek@gmail.com)
 */
public class ApplicationComponentFactory {
    public static ApplicationComponent create(CrateMateApplication application) {
        return DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(application))
                .build();
    }
}
