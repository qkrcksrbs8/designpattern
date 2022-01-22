package cg.park.designpattern.iterator;

public class Cleaner {
    Menu washMenu;

    public Cleaner(Menu washMenu) {
        this.washMenu = washMenu;
    }

    public void cleaning() {
        System.out.println("==========청소 시작==========");
        printCleaning(washMenu.createIterator());
        System.out.println("==========청소   끝==========");
    }

    private void printCleaning(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.description);
        }
    }
}
