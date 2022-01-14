package cg.park.designpattern.templateMethod;

public abstract class BurgerBeverage {

    final void makeBurger() {
        menu();
        bread();
        patty();
        onion();
        sauce();
        cheese();
    }

    abstract void menu();//메뉴

    abstract void patty();//패티(돼지,닭,소 등...)

    abstract void sauce();//버거 소스

    void bread() { System.out.println("모닝빵");}

    void onion() { System.out.println("양파");}

    void cheese() { System.out.println("치즈");}

}
