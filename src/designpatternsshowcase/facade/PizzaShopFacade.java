package designpatternsshowcase.facade;

/**
 *
 * @author Rémy Kaloustian
 */
public class PizzaShopFacade {
    
    private ShopPersonnel _cashier, _cookAssistant, _cook;
    
    public PizzaShopFacade(){
        _cashier = new ShopPersonnel("Brandon", "cashier");
        _cookAssistant = new ShopPersonnel("Bruno", "cook assistant");
        _cook = new ShopPersonnel("Jon", "cook");
    }
    
    public void orderPizza(){
      _cashier.transmitOrderToCook();
      _cookAssistant.getIngredients();
      _cook.assemblePizza();
      _cook.cookPizza();
      _cookAssistant.putPizzaInBox();
    }
}
