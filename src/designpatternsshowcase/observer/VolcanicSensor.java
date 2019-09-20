package designpatternsshowcase.observer;

/**
 *
 * @author Rémy Kaloustian
 */
public class VolcanicSensor extends Sensor{

    @Override
    public String getState() {
        //Usually we should have more behavior here, but this is just to test the pattern
        return "catastrophic";
    }
    
}
