package cg.park.designpattern.decorator;

import cg.park.designpattern.decorator.Burger.Size;

public class PcgBurger {

    public static void main(String args[]) {
        Burger burger = new BasicBurger();//기본 버거
        System.out.println("[첫 번째 주문] " +
                "\n버거: "+ burger.getDescription()
                +"\n가격: "+ burger.cost()
        );

        Burger cheeseBurger = new CheeseBurger();//치즈 버거
        cheeseBurger = new Cheese(cheeseBurger);//치즈 추가
        System.out.println("[두 번째 주문] " +
                "\n버거: "+cheeseBurger.getDescription()
                +"\n가격: "+cheeseBurger.cost()
        );

        Burger bulgogiBurger = new BulgogiBurger();//불고기 버거
        bulgogiBurger.setSize(Size.LARGE);//라지로 변경
        System.out.println("[세 번째 주문] " +
                "\n버거: "+bulgogiBurger.getDescription()
                +"\n가격: "+bulgogiBurger.cost()
        );

        Burger chickenBurger = new ChickenBurger();//치킨 버거
        chickenBurger = new Chicken(chickenBurger);//치킨 추가
        System.out.println("[네 번째 주문] " +
                "\n버거: "+chickenBurger.getDescription()
                +"\n가격: "+chickenBurger.cost()
        );
    }
}
