package cg.park.designpattern.iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Cleaner cleaner = new Cleaner(new WashMenu());
        cleaner.cleaning();
    }
}
