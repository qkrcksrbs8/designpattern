package cg.park.designpattern.decorator;

public abstract class Burger {
    public enum Size { BASIC, LARGE };//버거 사이즈
    Size size = Size.BASIC;//기본 제공 사이즈
    String description = "Unknown Burger";//버거 설명

    //버거 설명
    public String getDescription() {
        return description;
    }

    //버거 사이즈 변경
    public void setSize(Size size) {
        this.size = size;
    }

    //버거 사이즈 조회
    public Size getSize() {
        return this.size;
    }

    //버거 가격
    public abstract double cost();

}
