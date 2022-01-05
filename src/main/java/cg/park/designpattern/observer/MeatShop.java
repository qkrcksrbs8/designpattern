package cg.park.designpattern.observer;

public class MeatShop implements Observer, DisplayElement {

    private int meat;//과일
    private PreorderData preorderData;

    public MeatShop(PreorderData preorderData){
        this.preorderData = preorderData;
        preorderData.registerObserver(this);
    }

    public void update(int meat, int fruit, int vegetable) {
        this.meat = meat;
        display();
    }

    public void display() {
        System.out.println("[정육점] 고기재고: "+meat);
    }
}
