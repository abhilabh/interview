package DesignPattern.ObserverPattern;

public class MySubjectSubscribers implements Observer{

    private String name;
    private Subject topic;

    public MySubjectSubscribers(String name) {
        this.name = name;
    }


    @Override
    public void update() {
        System.out.println(topic.getUpdate(this));
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
