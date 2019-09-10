/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternsshowcase.strategy;

import designpatternsshowcase.Utils;
import designpatternsshowcase.strategy.eat.EatMeatBehavior;
import designpatternsshowcase.strategy.log.LogStarsBehavior;
import designpatternsshowcase.strategy.move.MoveWalkBehavior;
import designpatternsshowcase.strategy.speak.SpeakRoarBehavior;

/**
 *
 * @author Rémy Kaloustian
 */
public class StrategyMain {
    public static void main(String[] args) {
        Utils.print("Creating Cyborg animals");
        
        CyborgAnimal EagleTiger = new CyborgAnimal("EagleTiger", 
                new MoveWalkBehavior(), new EatMeatBehavior(), 
                new SpeakRoarBehavior(), new LogStarsBehavior());
    }
}
