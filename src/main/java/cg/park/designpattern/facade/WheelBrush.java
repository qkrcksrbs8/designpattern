package cg.park.designpattern.facade;

public class WheelBrush {
    String description;

    public WheelBrush(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " 휠 브러시 on");
    }

    public void off() {
        System.out.println(description + " 휠 브러시 off");
    }

}
