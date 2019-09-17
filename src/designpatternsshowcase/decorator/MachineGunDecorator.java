package designpatternsshowcase.decorator;

/**
 *
 * @author Rémy Kaloustian
 */
public class MachineGunDecorator extends MilitaryVehicleDecorator{
    
    public MachineGunDecorator(MilitaryVehicle vehicle) {
        super(vehicle);
    }
    
    public String fireEverything(){
        return super.fireEverything() + "Firing machine gun";
    }
    
}
