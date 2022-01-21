package cg.park.designpattern.facade;

public class CarWash {
    BubbleBomb bubbleBomb;//카 샴푸
    Bucket bucket;//물통
    PressureWasher pressureWasher;//고압 세척기
    Towel towel;//타월
    WashMitt washMitt;//세차용 스폰지
    WheelBrush wheelBrush;//휠 브러시

    public CarWash(
           BubbleBomb bubbleBomb
         , Bucket bucket
         , PressureWasher pressureWasher
         , Towel towel
         , WashMitt washMitt
         , WheelBrush wheelBrush)
    {
        this.bucket = bucket;
        this.washMitt = washMitt;
        this.wheelBrush = wheelBrush;
        this.bubbleBomb = bubbleBomb;
        this.towel = towel;
        this.pressureWasher = pressureWasher;
    }

    public void start() {
        bubbleBomb.on();//카 샴푸
        washMitt.on();//세차용 스폰지
        wheelBrush.on();//휠 브러시
        bucket.on();//물통
        pressureWasher.on();//고압수 뿌리기
        towel.on();//타월을 이용하여 물기 제거
    }

    public void end() {
        bubbleBomb.off();
        wheelBrush.off();
        washMitt.off();
        bucket.off();
        pressureWasher.off();
        towel.off();
    }

}
