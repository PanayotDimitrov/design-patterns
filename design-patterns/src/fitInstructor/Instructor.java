package fitInstructor;

import java.util.ArrayList;
import java.util.List;

public class Instructor {
    private Exercise pushUp;
    private Exercise SitDown;
    private List<Observer> observers = new ArrayList<>();

    public Instructor() {
        pushUp = new PushUp();
        SitDown = new SitDown();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void instructPushUp() {
        pushUp.perform();
        notifyObservers();
    }

    public void instructSitDown() {
        SitDown.perform();
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

