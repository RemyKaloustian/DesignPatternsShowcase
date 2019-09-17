package designpatternsshowcase.decorator;

import designpatternsshowcase.Utils;

/**
 *
 * @author Rémy Kaloustian
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Utils.print("In decorator");
        
        MilitaryVehicle tankWithMissiles = new GuidedMissileDecorator(new Tank());
        MilitaryVehicle chopperWithMachineGun = new MachineGunDecorator(new Chopper());
        Utils.print(tankWithMissiles.fireEverything());
        Utils.print(chopperWithMachineGun.fireEverything());
        
    }
}
