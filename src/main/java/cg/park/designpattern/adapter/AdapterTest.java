package cg.park.designpattern.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        Volt110 volt110 = new VoltAdapter220(new usedInKorea());
        Volt220 volt220 = new VoltAdapter110(new usedInJapan());

        volt110.plugIn110();//volt110 사용
        volt220.plugIn220();//volt220 사용

    }

}
