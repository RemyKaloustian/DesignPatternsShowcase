package designpatternsshowcase.facade;

import designpatternsshowcase.Utils;

/**
 *
 * @author Rémy Kaloustian
 */
public class ShopPersonnel {
    
    private String _name;
    private String _position;
    
    public ShopPersonnel(String name, String position){
        _name = name;
        _position = position;
    }
    
    public void transmitOrderToCook(){
        Utils.print(_name + " the "+ _position + " is transmitting the order");
    }
    
    public void getIngredients(){
        Utils.print(_name + " the "+ _position + " is getting the ingredients");
    }
    
    public void assemblePizza(){
        Utils.print(_name + " the "+ _position + " is assembling the pizza");
    }
    
    public void cookPizza(){
        Utils.print(_name + " the "+ _position + " is cooking the pizza");
    }
    
    public void putPizzaInBox(){
        Utils.print(_name + " the "+ _position + " is putting the pizza in the box");
    }
}
