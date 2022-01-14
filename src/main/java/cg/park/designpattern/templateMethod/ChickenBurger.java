package cg.park.designpattern.templateMethod;

public class ChickenBurger extends BurgerBeverage {
    public void menu() { System.out.println("*치킨 버거");}
    public void patty() { System.out.println("치킨 패티");}
    public void sauce() { System.out.println("양념치킨소스");}
}
