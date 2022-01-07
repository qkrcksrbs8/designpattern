package cg.park.designpattern.singleton;

public class Singleton {
    private volatile static Singleton singleton;

    private Singleton() {}

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    System.out.println("결제 후 서비스 제공");
                    singleton = new Singleton();
                    return singleton;
                }
            }
        }
        System.out.println("서비스 제공");
        return singleton;
    }

}
