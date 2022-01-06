package cg.park.designpattern.factory;

import java.util.ArrayList;
import java.util.List;

abstract public class Burger {
    String name;
    String bun;
    String sauce;
    List<String> toppings = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void order() {
        System.out.println("===========START===========");
        System.out.println("[주문]");
        System.out.println(name);
    }

    public void makeBurger() {
        System.out.println("[재료]");
        System.out.println(bun);
        System.out.println(sauce);
        toppings.forEach(str -> System.out.println(str));
    }

    public void done() {
        System.out.println("===========E N D===========");
    }

}
