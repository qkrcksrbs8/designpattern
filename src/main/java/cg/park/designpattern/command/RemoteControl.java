package cg.park.designpattern.command;

public class RemoteControl {

    public static void main(String[] args) {
        Light light = new Light();//Light 인스턴스 생성
        LightOn lightOn = new LightOn(light);//LightOn 인스턴스 생성
        LightOff lightOff = new LightOff(light);//LightOff 인스턴스 생성

        lightOn.execute();//ON
        lightOff.execute();//OFF
    }

}
