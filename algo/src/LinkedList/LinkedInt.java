package LinkedList;

/**
 * Created by abhilabh on 1/25/19.
 */
public class LinkedInt {

    Node head;
    public class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
        }
    }

    public LinkedInt insertNode(LinkedInt list,int data){
        Node new_node = new Node(data);
        if(list.head == null){
            list.head = new_node;
        } else {
            Node temp = list.head;
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next = new_node;
        }
        return list;
    }
    public void printList(LinkedInt list){
        Node temp=list.head;
        while(temp!=null){
            System.out.print(temp.data+"\t");
            temp=temp.next;
        }
        System.out.println();
    }

    public LinkedInt deleteNode(LinkedInt list,int data){
        Node temp= list.head;
        if(list.head.data == data){
            list.head = temp.next;
        }else {
            while(temp != null){
                if(temp.next !=null && temp.next.data == data) {
                    temp.next = temp.next.next;
                }
                temp = temp.next;
            }
        }
        return list;
    }
}
