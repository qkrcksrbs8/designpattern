package cg.park.designpattern.composite;

public abstract class MenuComponent {
    public void add(MenuComponent menuComponent) {throw new UnsupportedOperationException();}
    public void remove(MenuComponent menuComponent) {throw new UnsupportedOperationException();}
    public String getDescription() {throw new UnsupportedOperationException();}
    public void print() {
        throw new UnsupportedOperationException();
    }
}
