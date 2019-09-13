package designpatternsshowcase.proxy;

import designpatternsshowcase.Utils;

/**
 *
 * @author Rémy Kaloustian
 */
public class ProxyMain {
    public static void main(String[] args) {
        Utils.print("In proxy boi");
        IData proxy = new SensitiveDataProxy();
        Utils.print(proxy.getData());
    }
}
