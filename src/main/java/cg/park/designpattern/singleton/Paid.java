package cg.park.designpattern.singleton;

public class Paid {

    public void perpare(String name) {
        System.out.println("유료 서비스 ========== START ==========");
        System.out.println(name +" 접속");
        Singleton.getInstance();
        System.out.println("유료 서비스 ========== E N D ==========");
    }
}
