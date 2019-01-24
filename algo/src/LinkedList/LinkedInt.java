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
        if(list.head==null){
            list.head = new_node;
        }
        else{
            Node temp=list.head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=new_node;
        }
        return list;
    }
    public void printList(LinkedInt list){
        Node temp=list.head;
        while(temp.next!=null){
            System.out.println(temp.data+"\t");
            temp=temp.next;
        }
    }
}
