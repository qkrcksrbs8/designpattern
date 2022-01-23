package cg.park.designpattern.composite;

public class MenuItem extends MenuComponent {
    String description;
    public MenuItem(String description) {
        this.description = description;
    }
    public String getDescription() {return description;}
    public void print() {
        System.out.println(getDescription());
    }
}
