/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternsshowcase.strategy.move;

/**
 *
 * @author Rémy Kaloustian
 */
public class MoveFlyBehavior implements IMoveBehavior{

    @Override
    public String move() {
        return "I fly in dah sky \n";
    }
}
