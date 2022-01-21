package cg.park.designpattern.iterator;

public class WashMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public WashMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("카 샴푸");
        addItem("세차용 스폰지");
        addItem("휠 브러시 사용");
        addItem("물통에 스폰지 세척");
        addItem("고압수 뿌리기");
        addItem("타월을 이용하여 물기 제거");
    }

    public void addItem(String description) {
        MenuItem washItem = new MenuItem(description);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("최대 개수를 초과했습니다.");
            return;
        }
        menuItems[numberOfItems] = washItem;
        numberOfItems++;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new WashMenuIterator(menuItems);
    }

}
