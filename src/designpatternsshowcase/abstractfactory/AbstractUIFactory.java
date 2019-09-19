package designpatternsshowcase.abstractfactory;

/**
 *
 * @author Rémy Kaloustian
 */
public abstract class AbstractUIFactory {
    protected Modal _modal;
    protected Button _button;
    public abstract Modal getModal();
    public abstract Button getButton();
}
