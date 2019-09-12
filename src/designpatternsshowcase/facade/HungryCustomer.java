package designpatternsshowcase.facade;

/**
 *
 * @author Rémy Kaloustian
 */
public class HungryCustomer {
    
    PizzaShopFacade _pizzaShop;
    
    public HungryCustomer(PizzaShopFacade shop){
        _pizzaShop = shop;
    }
    
    public void orderPizza(){
        _pizzaShop.orderPizza();
    }
}
