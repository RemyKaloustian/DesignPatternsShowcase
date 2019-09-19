package designpatternsshowcase.singleton;

import designpatternsshowcase.Utils;

/**
 *
 * @author Rémy Kaloustian
 */
public class SingletonMain {
    public static void main(String[] args) {
        //Let's say somebody wants to create the Sun
        Utils.print("Data about the ONE AND only Sun");
        Utils.print("Age:"+Sun.getInstance().getAge());
        Utils.print("Size:"+Sun.getInstance().getSize());
    }
}
