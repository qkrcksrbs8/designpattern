package cg.park.designpattern.adapter;

public class VoltAdapter110  implements Volt220 {
    Volt110 volt110;

    public VoltAdapter110(Volt110 volt110) {
        this.volt110 = volt110;
    }

    public void plugIn220() {
        volt110.plugIn110();
    }
}