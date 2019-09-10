
package designpatternsshowcase.strategy;

import designpatternsshowcase.Utils;
import designpatternsshowcase.strategy.eat.EatGrainBehavior;
import designpatternsshowcase.strategy.eat.EatMeatBehavior;
import designpatternsshowcase.strategy.log.LogDotsBehavior;
import designpatternsshowcase.strategy.log.LogStarsBehavior;
import designpatternsshowcase.strategy.move.MoveFlyBehavior;
import designpatternsshowcase.strategy.move.MoveWalkBehavior;
import designpatternsshowcase.strategy.speak.SpeakMeowBehavior;
import designpatternsshowcase.strategy.speak.SpeakRoarBehavior;

/**
 *
 * @author Rémy Kaloustian
 */
public class StrategyMain {
    public static void main(String[] args) {
        Utils.print("Creating Cyborg animals");
        
        CyborgAnimal EagleTiger = new CyborgAnimal("EagleTiger", 
                new MoveFlyBehavior(), new EatMeatBehavior(), 
                new SpeakRoarBehavior(), new LogStarsBehavior());
        
        CyborgAnimal CatPenguin = new CyborgAnimal("CatPenguin", 
                new MoveWalkBehavior(), new EatGrainBehavior(),
                new SpeakMeowBehavior(), new LogDotsBehavior());
    }
}
