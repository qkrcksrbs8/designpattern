package cg.park.designpattern.strategy;

public class RockingChair extends Chair {
    public RockingChair() {
        moves = new dontMovingChair();
        sounds = new RockingChairSound();
    }
    public void RockingChairSound(){};
}
