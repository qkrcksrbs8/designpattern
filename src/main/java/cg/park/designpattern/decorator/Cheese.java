package cg.park.designpattern.decorator;

public class Cheese extends BurgerOption {
    //버거 객체
    public Cheese(Burger burger) {
        this.burger = burger;
    }

    //버거 설명에 Cheese 추가
    public String getDescription() {return burger.getDescription() + ", Cheese";}

    //버거 가격에 Cheese 가격 추가
    public double cost() {return burger.cost() + 500;}
}
