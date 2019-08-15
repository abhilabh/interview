package LinkedList;

/**
 * Created by abhilabh on 1/25/19.
 */
public class DoublyLinkedList {

    Node head;
    public class Node{
        int data;
        Node prev,next;
        Node(int data){
            this.data =data;
        }
    }

    public DoublyLinkedList insert(DoublyLinkedList list,int data){
        Node new_node = new Node(data);
        if(list.head == null){
            list.head = new_node;
        }else{
            Node temp = list.head;
            Node prev = null;
            while(temp != null){
                prev = temp;
                temp = temp.next;
            }
            new_node.prev = prev;
            prev.next = new_node;
        }
        return list;
    }

    public void printList(DoublyLinkedList list){
        Node temp = list.head;

        while (temp != null){
            System.out.print("\t"+temp.data);
            temp = temp.next;
        }
    }

    public DoublyLinkedList delete(DoublyLinkedList list, int data){
        Node temp = list.head;
        Node prev = null;

        if(temp.data == data){
            list.head = temp.next;
            temp.next.prev = null;
        }else{
            while(temp != null){
                if(temp.data == data){
                    //last node
                    if(temp.next == null){
                        temp.prev.next = null;
                    }
                    else{
                        temp.prev.next = temp.next;
                        temp.next.prev = temp.prev;
                    }
                }
                temp = temp.next;
            }
        }
        return  list;
    }
}
