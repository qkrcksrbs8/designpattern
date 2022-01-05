package cg.park.designpattern.decorator;

public abstract class BurgerOption extends Burger {
    public Burger burger;//버거 객체 상속
    public abstract String getDescription();//버거 설명

    //버거 사이즈
    public Size getSize() {return burger.getSize();}
}
