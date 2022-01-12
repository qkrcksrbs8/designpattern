package cg.park.designpattern.facade;

public class WashMitt {
    String description;

    public WashMitt(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " 세차용 스폰지 on");
    }

    public void off() {
        System.out.println(description + " 세차용 스폰지 off");
    }

}
