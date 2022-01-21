package cg.park.designpattern.iterator;

public class WashMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public WashMenuIterator(MenuItem[] items) {this.items = items;}

    public MenuItem next() {return items[position++];}
    public boolean hasNext() {return items.length > position;}
}
