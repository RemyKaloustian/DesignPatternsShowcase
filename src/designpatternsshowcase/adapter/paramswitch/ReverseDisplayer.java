package designpatternsshowcase.adapter.paramswitch;

import designpatternsshowcase.Utils;

/**
 *
 * @author Rémy Kaloustian
 */
public class ReverseDisplayer {
    public void display(String param1, String param2){
        Utils.print(param1);
        Utils.print(param2);
    }
}
