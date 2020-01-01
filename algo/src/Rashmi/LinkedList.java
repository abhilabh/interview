package Rashmi;

public class LinkedList {

     static Node head;
     static void insert(int data){
         if(head == null){
             head = new Node(data);
         }
         else{
             Node temp = head;
             while(temp.next !=null){
                 temp = temp.next;
             }
             temp.next = new Node(data);
         }
    }

    static void print(){
         Node temp = head;
         while(temp!=null){
             System.out.println(temp.data);
             temp = temp.next;
         }
    }

    public static void main(String[] args) {
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        print();
    }

}


class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
