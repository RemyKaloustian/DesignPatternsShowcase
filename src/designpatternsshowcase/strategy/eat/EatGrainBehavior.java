
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
