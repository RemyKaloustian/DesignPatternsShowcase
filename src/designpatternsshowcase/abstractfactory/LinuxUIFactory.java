package designpatternsshowcase.abstractfactory;

/**
 *
 * @author Rémy Kaloustian
 */
public class LinuxUIFactory extends AbstractUIFactory{

    @Override
    public Modal getModal() {
        return new LinuxModal();
    }

    @Override
    public Button getButton() {
        return new LinuxButton();
    }
}
