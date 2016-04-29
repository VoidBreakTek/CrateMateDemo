package uk.co.breaktek.cratemate.annotation;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Scope for single Activity dependency instances
 * Chris Shotton (voidbreaktek@gmail.com)
 */
@Scope
@Retention(RUNTIME)
public @interface ActivityScope {
}