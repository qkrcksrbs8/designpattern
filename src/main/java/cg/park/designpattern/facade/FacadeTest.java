package cg.park.designpattern.facade;

public class FacadeTest {

    public static void main(String[] args) {
        BubbleBomb bubbleBomb = new BubbleBomb("A사 제품");
        Bucket bucket = new Bucket("A사 제품");
        PressureWasher pressureWasher = new PressureWasher("A사 제품");
        Towel towel = new Towel("A사 제품");
        WashMitt washMitt = new WashMitt("A사 제품");
        WheelBrush wheelBrush = new WheelBrush("A사 제품");

        CarWash carWash = new CarWash(
                bubbleBomb
                , bucket
                , pressureWasher
                , towel
                , washMitt
                , wheelBrush);

        carWash.start();//세차 시작
        System.out.println("=================================");
        carWash.end();//세차 종료

    }

}
