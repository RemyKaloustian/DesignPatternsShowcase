package designpatternsshowcase.abstractfactory;

import designpatternsshowcase.Utils;
import java.util.ArrayList;

/**
 *
 * @author Rémy Kaloustian
 */
public class AbstractFactoryMain {
    public static void main(String[] args) {
        Utils.print("In Abstract Factory");
        AbstractUIFactory linux = new LinuxUIFactory();
        AbstractUIFactory windows = new WindowsUIFactory();
        AbstractUIFactory macos = new MacOsUIFactory();
        
        ArrayList<AbstractUIFactory> list=new ArrayList<AbstractUIFactory>();
        list.add(linux);
        list.add(windows);
        list.add(macos);
        
        for (AbstractUIFactory factory : list){
            factory.getModal();
            factory.getButton();
        }        
    }
}
