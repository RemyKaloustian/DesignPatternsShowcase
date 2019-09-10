
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
