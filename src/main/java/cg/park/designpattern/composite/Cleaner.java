package cg.park.designpattern.composite;

public class Cleaner {
    MenuComponent allMenus;
    public Cleaner(MenuComponent allMenus) {this.allMenus = allMenus;}
    public void printMenu() {allMenus.print();}
}
