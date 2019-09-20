package designpatternsshowcase.observer;

import designpatternsshowcase.Utils;

/**
 *
 * @author Rémy Kaloustian
 */
public class ObserverMain {
    public static void main(String[] args) {
        Utils.print("In Observer");
        
        Sensor volcanicSensor = new VolcanicSensor();
        IObserver mainTVDisplay = new MainTVDisplay(volcanicSensor);
        IObserver computerScreenDisplay = new ComputerScreenDisplay(volcanicSensor);
        IObserver phoneDisplay = new PhoneDisplay(volcanicSensor);
        
        volcanicSensor.add(mainTVDisplay);        
        volcanicSensor.add(computerScreenDisplay);
        volcanicSensor.add(phoneDisplay);
        
        volcanicSensor.notifyObservers();


    }
}
