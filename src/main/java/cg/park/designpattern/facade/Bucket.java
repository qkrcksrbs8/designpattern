package cg.park.designpattern.facade;

public class Bucket {
    String description;

    public Bucket(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " 물통에 스폰지 세척 on");
    }

    public void off() {
        System.out.println(description + " 물통에 스폰지 세척 off");
    }
}
