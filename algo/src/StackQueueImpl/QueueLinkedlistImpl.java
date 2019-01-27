package StackQueueImpl;

/**
 * Created by abhilabh on 1/27/19.
 */
public class QueueLinkedlistImpl <Item> {
    private Node first = null, last = null;

    private class Node {
        Item item;
        Node next;

        Node(Item item) {
            this.item = item;
        }
    }

        public boolean isEmpty(){
            return first == null;
        }

        public void enQueue(Item item){
            Node oldLast = last;
            last = new Node(item);
            if(isEmpty()) first = last;
            else          oldLast.next = last;
        }
        public Item deQueue(){
            Item item = first.item;
            first = first.next;
            if (isEmpty()) last = null;
            return  item;
        }

        public void printQueue(){
            Node current = first;
            while(current != null){
                System.out.print("\t"+current.item);
                current = current.next;
            }
        }
}
