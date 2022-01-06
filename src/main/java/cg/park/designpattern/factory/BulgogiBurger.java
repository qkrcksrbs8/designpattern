package cg.park.designpattern.factory;

public class BulgogiBurger extends Burger {
    public BulgogiBurger() {
        name = "Bulgogi Burger";
        bun = "basic bun";
        sauce = "Bulgogi sauce";
        toppings.add("Bulgogi");
    }
}
