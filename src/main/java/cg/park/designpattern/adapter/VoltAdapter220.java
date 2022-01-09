package cg.park.designpattern.adapter;

public class VoltAdapter220 implements Volt110 {
    Volt220 volt220;

    public VoltAdapter220(Volt220 volt220) {
        this.volt220 = volt220;
    }

    public void plugIn110() {
        volt220.plugIn220();
    }
}
