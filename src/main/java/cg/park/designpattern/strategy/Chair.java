package cg.park.designpattern.strategy;

public abstract class Chair {
    Moves moves;
    Sounds sounds;

    public Chair (){}

    public void eventMoves() { moves.move(); }

    public void eventSounds() { sounds.sound(); }

    public void setMoves(Moves moves) {
        this.moves = moves;
    }

    public void setSounds(Sounds sounds) {
        this.sounds = sounds;
    }

}
