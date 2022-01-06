package cg.park.designpattern.factory;

public class Order {

    public static void main(String[] args) {
        BurgerStore store = new BurgerStore(new BurgerFactory());
        store.orderBurger("cheese");//치즈버거 주문
        store.orderBurger("bulgogi");//불고기버거 주문
        store.orderBurger("chicken");//치킨버거 주문
    }

}
