package DesignPattern.ObserverPattern;

public interface Subject {
    public void resister(Observer obj);
    public void unResister(Observer obj);
    public void notifyObserver();
    public String getUpdate(Observer obj);
    public void postMessage(String msg);
}
