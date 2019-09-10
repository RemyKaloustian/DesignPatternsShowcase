/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternsshowcase.strategy.eat;

/**
 *
 * @author Rémy Kaloustian
 */
public class EatGrainBehavior implements IEatBehavior{

    @Override
    public String eat() {
        return "I eat grain \n";
    }
}
