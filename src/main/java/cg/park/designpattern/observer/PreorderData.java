package cg.park.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class PreorderData implements Subject {
    private List<Observer> observers;

    private int meat;//고기
    private int fruit;//과일
    private int vegetable;//야채

    public PreorderData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(meat, fruit, vegetable);
        }
    }

    public void foodMaterialsChange(){
        notifyObservers();
    }

    public void setFoodMaterials(int meat, int fruit, int vegetable){
        this.meat = meat;
        this.fruit = fruit;
        this.vegetable = vegetable;
        foodMaterialsChange();
    }

}
