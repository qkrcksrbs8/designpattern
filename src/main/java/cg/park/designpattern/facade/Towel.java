package cg.park.designpattern.facade;

public class Towel {
    String description;

    public Towel(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " 타월로 물기 제거 on");
    }

    public void off() {
        System.out.println(description + " 타월로 물기 제거 off");
    }

}
