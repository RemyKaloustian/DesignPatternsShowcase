
package designpatternsshowcase.strategy.eat;

/**
 *
 * @author Rémy Kaloustian
 */
public class EatMeatBehavior implements IEatBehavior{

    @Override
    public String eat() {
        return "I eat meat \n";
    }
}
