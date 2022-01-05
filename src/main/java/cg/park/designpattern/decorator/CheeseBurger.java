package cg.park.designpattern.decorator;

public class CheeseBurger extends Burger {
    public CheeseBurger() {
        description = "Basic Burger";
    }//버거 이름
    public double cost() {
        return 6000;
    }//버거 가격

    //------추가 부분------
    public void addCheese() {};//치즈 추가
    public void addPatty() {};//패티 추가
}
