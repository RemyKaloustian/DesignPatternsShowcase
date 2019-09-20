package designpatternsshowcase.observer;

import designpatternsshowcase.Utils;

/**
 *
 * @author Rémy Kaloustian
 */
public class ComputerScreenDisplay extends DisplayObserver{

    public ComputerScreenDisplay(Sensor sensor) {
        super(sensor);
    }

    @Override
    public void display(String data) {
        Utils.print("Displaying from computer screen "+ data);
    }
    
}
