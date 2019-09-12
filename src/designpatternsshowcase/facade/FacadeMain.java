package designpatternsshowcase.facade;

import designpatternsshowcase.Utils;

/**
 *
 * @author Rémy Kaloustian
 */
public class FacadeMain {
    public static void main(String[] args) {
        HungryCustomer customer = new HungryCustomer(new PizzaShopFacade());
        customer.orderPizza();
    }
}
