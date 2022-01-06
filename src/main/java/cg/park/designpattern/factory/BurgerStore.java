package cg.park.designpattern.factory;

public class BurgerStore {
    BurgerFactory factory;

    public BurgerStore(BurgerFactory factory) {
        this.factory = factory;
    }

    public void orderBurger(String type) {
        Burger burger = factory.createBurger(type);//버거 객체 생성
        burger.order();//주문
        burger.makeBurger();//준비 중
        burger.done();//준비 완료
    }

}
