package cg.park.designpattern.observer;

public class VegetableShop implements Observer, DisplayElement {

    private int meat;//과일
    private PreorderData preorderData;

    public VegetableShop(PreorderData preorderData){
        this.preorderData = preorderData;
        preorderData.registerObserver(this);
    }

    public void update(int meat, int fruit, int vegetable) {
        this.meat = meat;
        display();
    }

    public void display() {
        System.out.println("[야채가게] 야채재고: "+meat);
    }
}
