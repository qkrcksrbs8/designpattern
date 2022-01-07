package cg.park.designpattern.singleton;

public class Main {

    public static void main(String[] args) {
        Paid paid = new Paid();
        paid.perpare("1년 전");
        paid.perpare("반년 전");
        paid.perpare("현재");
    }

}
