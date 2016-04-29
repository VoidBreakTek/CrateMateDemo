package uk.co.breaktek.cratemate.mvp;

/**
 * Interface representing a Presenter in a model view presenter (MVP) pattern
 * <p/>
 * Chris Shotton (voidbreaktek@gmail.com)
 */
public interface Presenter<ViewType extends MvpView> {
    void initialize();

    void bind(ViewType view);
}