package designpatternsshowcase.observer;

import designpatternsshowcase.Utils;

/**
 *
 * @author Rémy Kaloustian
 */
public class PhoneDisplay extends DisplayObserver{

    public PhoneDisplay(Sensor sensor) {
        super(sensor);
    }

    @Override
    public void display(String data) {
        Utils.print("Displaying from phone "+ data);
    }
    
}
