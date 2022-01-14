package cg.park.designpattern.templateMethod;

public class TemplateMethodTest {
    public static void main(String[] args) {
        BulgogiBurger bulgogiBurger = new BulgogiBurger();
        ChickenBurger chickenBurger = new ChickenBurger();

        bulgogiBurger.makeBurger();
        System.out.println("==========================");
        chickenBurger.makeBurger();

    }
}
