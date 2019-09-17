package designpatternsshowcase.decorator;

/**
 *
 * @author Rémy Kaloustian
 */
public class GuidedMissileDecorator extends MilitaryVehicleDecorator{
    
    public GuidedMissileDecorator(MilitaryVehicle vehicle) {
        super(vehicle);
    }
    
    @Override
    public String fireEverything(){
        return super.fireEverything() + "Firing guided missile ";
    }
    
}
