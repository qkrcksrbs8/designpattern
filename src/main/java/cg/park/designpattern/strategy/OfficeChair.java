package cg.park.designpattern.strategy;

public class OfficeChair extends Chair {
    public OfficeChair() {
        moves = new dontMovingChair();
        sounds = new OfficeChairSound();
    }
    public void OfficeChairSound(){};
}
