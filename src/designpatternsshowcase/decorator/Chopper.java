package designpatternsshowcase.decorator;

/**
 *
 * @author Rémy Kaloustian
 */
public class Chopper extends MilitaryVehicle{

    @Override
    public String fireEverything() {
        return "Firing while flying ";
    }
    
}
