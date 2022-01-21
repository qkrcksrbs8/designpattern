package cg.park.designpattern.iterator;

public class MenuItem {
    String description;
    public MenuItem(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public String toString() { return description; }
}
