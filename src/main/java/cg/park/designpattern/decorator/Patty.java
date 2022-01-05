package cg.park.designpattern.decorator;

public class Patty extends BurgerOption {
    public Patty(Burger burger) {
        this.burger = burger;
    }

    public String getDescription() {return burger.getDescription() + ", Patty";}

    public double cost() {return burger.cost() + 2000;}
}
