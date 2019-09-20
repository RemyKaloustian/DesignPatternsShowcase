package designpatternsshowcase.observer;

import designpatternsshowcase.Utils;

/**
 *
 * @author Rémy Kaloustian
 */
public class MainTVDisplay extends DisplayObserver{

    public MainTVDisplay(Sensor sensor) {
        super(sensor);
    }

    @Override
    public void display(String data) {
        Utils.print("Displaying on TV, " + data);
    }
}
