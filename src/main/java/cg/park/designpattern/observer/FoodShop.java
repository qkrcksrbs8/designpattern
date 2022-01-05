package cg.park.designpattern.observer;

public class FoodShop implements Observer, DisplayElement {

    private int meat;//고기
    private int fruit;//과일
    private int vegetable;//야채
    private PreorderData preorderData;

    public FoodShop(PreorderData preorderData){
        this.preorderData = preorderData;
        preorderData.registerObserver(this);
    }

    public void update(int meat, int fruit, int vegetable) {
        this.meat = meat;
        this.fruit = fruit;
        this.vegetable = vegetable;
        display();
    }

    public void display() {
        System.out.print("[종합마트] 고기재고: "+meat);
        System.out.print(" 과일재고: "+fruit);
        System.out.println(" 야채재고: "+vegetable);
    }
}
