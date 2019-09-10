
package designpatternsshowcase.strategy.speak;

/**
 *
 * @author Rémy Kaloustian
 */
public class SpeakMeowBehavior implements ISpeakBehavior{

    @Override
    public String speak(String content) {
        return "I am meowing my name, " + content + "\n";
    }
    
}
