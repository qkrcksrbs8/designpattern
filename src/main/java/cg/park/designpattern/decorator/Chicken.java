package cg.park.designpattern.decorator;

public class Chicken extends BurgerOption {
    public Chicken(Burger burger) {
        this.burger = burger;
    }

    public String getDescription() {
        return burger.getDescription() + ", Chicken";
    }

    public double cost() {return burger.cost() + 1000;}
}
