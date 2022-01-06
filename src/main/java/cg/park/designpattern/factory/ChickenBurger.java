package cg.park.designpattern.factory;

public class ChickenBurger extends Burger {
    public ChickenBurger() {
        name = "Chicken Burger";
        bun = "basic bun";
        sauce = "red sauce";
        toppings.add("Chicken");
    }

}
