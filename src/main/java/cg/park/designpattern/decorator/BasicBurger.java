package cg.park.designpattern.decorator;

public class BasicBurger extends Burger {

    //버거 설명: 기본 버거
    public BasicBurger() {
        description = "Basic Burger";
    }

    //가격: 5000
    public double cost() {
        return 5000;
    }
}
