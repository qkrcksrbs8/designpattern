package cg.park.designpattern.facade;

public class BubbleBomb {
    String description;
    public BubbleBomb(String description) {
        this.description = description;
    }

    public void on() {System.out.println(description + " 샴푸 on");}

    public void off() {
        System.out.println(description + " 샴푸 off");
    }

}
