package cg.park.designpattern.facade;

public class PressureWasher {
    String description;

    public PressureWasher(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " 고압수 뿌리기 on");
    }

    public void off() {
        System.out.println(description + " 고압수 뿌리기 off");
    }

}
