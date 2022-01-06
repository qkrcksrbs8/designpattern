package cg.park.designpattern.factory;

public class BurgerFactory {

    public Burger createBurger(String type) {
        if (type.equals("cheese")) return new CheeseBurger();
        if (type.equals("bulgogi")) return new BulgogiBurger();
        if (type.equals("chicken")) return new ChickenBurger();
        return null;
    }
}
