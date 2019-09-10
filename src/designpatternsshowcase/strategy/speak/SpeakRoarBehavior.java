
package designpatternsshowcase.strategy.speak;

import designpatternsshowcase.Utils;

/**
 *
 * @author Rémy Kaloustian
 */
public class SpeakRoarBehavior implements ISpeakBehavior{

    @Override
    public String speak(String content) {
        return "I am roaring my name, " + content + "\n";
    }    
}
