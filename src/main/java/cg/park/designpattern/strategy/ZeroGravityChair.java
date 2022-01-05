package cg.park.designpattern.strategy;

public class ZeroGravityChair extends Chair {
    public ZeroGravityChair() {
        moves = new MovingChair();
        sounds = new ZeroGravityChairSound();
    }

    public void ZeroGravityChairSound(){};
}
