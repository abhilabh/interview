package DesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject{
    List<Observer> ObserversList;
    private String message;
    private boolean changed;

    public Topic() {
        this.ObserversList = new ArrayList<>();
    }

    @Override
    public void resister(Observer obj) {
        ObserversList.add(obj);

    }

    @Override
    public void unResister(Observer obj) {
        ObserversList.remove(obj);

    }

    @Override
    public void notifyObserver() {
        for (Observer obj : ObserversList) {
            obj.update();
        }

    }

    @Override
    public String getUpdate(Observer obj) {
        return this.message;
    }

    @Override
    public void postMessage(String msg) {
        System.out.println("Message Posted to Topic:"+msg);
        this.message = msg;
        this.changed = true;
        notifyObserver();
    }
}
