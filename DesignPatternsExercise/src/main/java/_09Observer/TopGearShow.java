package _09Observer;

import java.util.ArrayList;
import java.util.List;

public class TopGearShow implements Subject {

    private List<Observer> observers;

    public TopGearShow() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(String updateMsg) {
        for (Observer observer : observers) {
            observer.update(updateMsg);
        }
    }

}
