package cg.park.designpattern.factory;

public class CheeseBurger extends Burger {
    public CheeseBurger() {
        name = "Cheese Burger";
        bun = "Cheese bun";
        sauce = "Cheese sauce";
        toppings.add("Cheese");
        toppings.add("Patty");
    }
}
