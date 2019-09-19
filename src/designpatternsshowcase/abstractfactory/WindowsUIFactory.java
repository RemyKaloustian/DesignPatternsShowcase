package designpatternsshowcase.abstractfactory;

/**
 *
 * @author Rémy Kaloustian
 */
public class WindowsUIFactory extends AbstractUIFactory{

    @Override
    public Modal getModal() {
        return new WindowsModal();
    }

    @Override
    public Button getButton() {
        return new WindowsButton();
    }
}
