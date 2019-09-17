package designpatternsshowcase.decorator;

/**
 *
 * @author Rémy Kaloustian
 */
public class Tank extends MilitaryVehicle{

    @Override
    public String fireEverything() {
        return "Firing while rolling ";
    }
    
}
