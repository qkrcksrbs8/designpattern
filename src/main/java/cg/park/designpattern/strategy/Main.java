package cg.park.designpattern.strategy;

public class Main {
    public static void main(String[] args) {
        //무중력의자 인스턴스 생성
        Chair chair = new ZeroGravityChair();
        chair.eventMoves();//움직임 여부 호출
        chair.eventSounds();//의자 소리 호출

        chair.setMoves(new dontMovingChair());//못움직이는 의자로 선언
        chair.setSounds(new RockingChairSound());//흔들의자 소리로 변경
        chair.eventMoves();//움직임 여부 호출
        chair.eventSounds();//의자 소리 호출

    }
}
