package cg.park.designpattern.composite;

public class CompositeTest {
    public static void main(String[] args) {
        MenuComponent wash = new Menu("새차");
        MenuComponent company = new Menu("회사");
        MenuComponent allMenus = new Menu("모든 메뉴");
        allMenus.add(wash);
        wash.add(new MenuItem("카 샴푸"));
        wash.add(new MenuItem("세차용 스폰지"));
        wash.add(new MenuItem("휠 브러시 사용"));
        wash.add(new MenuItem("물통에 스폰지 세척"));
        wash.add(new MenuItem("고압수 뿌리기"));
        wash.add(new MenuItem("타월을 이용하여 물기 제거"));
        wash.add(company);
        company.add(new MenuItem("A사"));
        company.add(new MenuItem("B사"));
        company.add(new MenuItem("C사"));
        Cleaner cleaner = new Cleaner(allMenus);
        cleaner.printMenu();
        //test
        //mac 연정
    }
}
