
package designpatternsshowcase.strategy.log;

import designpatternsshowcase.Utils;

/**
 *
 * @author Rémy Kaloustian
 */
public class LogDotsBehavior implements ILogBehavior{

    @Override
    public void log(String content) {
        Utils.print(content, ".............");
    }
}
