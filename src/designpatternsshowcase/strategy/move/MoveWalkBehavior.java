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
public class MoveWalkBehavior implements IMoveBehavior{

    @Override
    public String move() {
        return "I walk on dah ground \n";
    }
}
