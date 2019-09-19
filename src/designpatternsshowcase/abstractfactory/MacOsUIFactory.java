package designpatternsshowcase.abstractfactory;

/**
 *
 * @author Rémy Kaloustian
 */
public class MacOsUIFactory extends AbstractUIFactory{

    @Override
    public Modal getModal() {
        return new MacOsModal();
    }

    @Override
    public Button getButton() {
        return new MacOsButton();
    }
}
