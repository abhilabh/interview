package StackQueueImpl;

/**
 * Created by abhilabh on 1/27/19.
 */
public class StackLinklistimpl <Item> {
    private Node first = null;

    private class Node{
        Item item;
        Node next;
        Node(Item item){
            this.item = item;
        }
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void push(Item item){
        Node oldFirst = first;
        Node newFirst = new Node(item);
        first = newFirst;
        first.next = oldFirst;
    }

    public Item pop(){
        Item item = first.item;
        first = first.next;
        return item;
    }

    public void printStack(){
        Node current = first;
        while (current != null) {

            System.out.print("\t" + current.item);
            current = current.next;
        }
    }

}
