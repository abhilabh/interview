package DesignPattern.ObserverPattern;

public class ObserverMain {
    public static void main(String[] args) {
        Topic topic = new Topic();

        //create observers
        Observer obj1 = new MySubjectSubscribers("Obj1");
        Observer obj2 = new MySubjectSubscribers("Obj2");
        Observer obj3 = new MySubjectSubscribers("Obj3");

        //register observers to the subject
        topic.resister(obj1);
        topic.resister(obj2);
        topic.resister(obj3);

        //attach observer to subject
        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);

        //check if any update is available
        obj1.update();

        //now send message to subject
        topic.postMessage("New Message");
        obj2.update();

    }
}
