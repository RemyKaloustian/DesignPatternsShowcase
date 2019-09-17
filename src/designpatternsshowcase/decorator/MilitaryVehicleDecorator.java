package designpatternsshowcase.decorator;

/**
 *
 * @author Rémy Kaloustian
 */
public abstract class MilitaryVehicleDecorator extends MilitaryVehicle{
    private MilitaryVehicle _vehicle;
    
    public MilitaryVehicleDecorator(MilitaryVehicle vehicle){
        _vehicle = vehicle;
    }
    @Override
    public String fireEverything() {
        return _vehicle.fireEverything();
    }
    
}
