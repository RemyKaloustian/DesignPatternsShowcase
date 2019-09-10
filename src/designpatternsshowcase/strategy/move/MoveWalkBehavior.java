
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
