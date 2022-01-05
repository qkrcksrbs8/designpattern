package cg.park.designpattern.observer;

public class FruitShop implements Observer, DisplayElement {

    private int fruit;//과일
    private PreorderData preorderData;

    public FruitShop(PreorderData preorderData){
        this.preorderData = preorderData;
        preorderData.registerObserver(this);
    }

    public void update(int meat, int fruit, int vegetable) {
        this.fruit = fruit;
        display();
    }

    public void display() {
        System.out.println("[과일가게] 과일재고: "+fruit);
    }

}
