package LinkedList;

public class ReverseByK {
    public  LinkedInt.Node rev(LinkedInt.Node x, LinkedInt.Node y){
        LinkedInt.Node s=x,t=x,t1=x;
        s=y.next;
        while(t1!=s){
            if(t1==x){
                //t=t1;
                t1= t1.next;
                t.next=y.next;
            }
            else {
                LinkedInt.Node t2 = t1.next;
                t1.next = t;
                t= t1;
                t1= t2;
            }
        }
        return t;



    }
    public LinkedInt.Node reverse(LinkedInt list, LinkedInt.Node s, LinkedInt.Node e, int k){
        int j=1;
        while(j <k && e!=null){
            e=e.next;
            j++;
        }
        if(j!=k || e==null) return s;
        else {
            e.next = reverse(list,e.next,e.next,k);
        }
        return rev(s,e);

    }
    public LinkedInt.Node reverselist(LinkedInt list, int k){
        return reverse(list,list.head,list.head,2);
    }
    public static void main(String[] args) {
        ReverseByK x = new ReverseByK();
        LinkedInt list = new LinkedInt();
        list.insertNode(list,1);
        list.insertNode(list,2);
        list.insertNode(list,3);
        list.insertNode(list,4);
        list.insertNode(list,5);
        //list.insertNode(list,6);
        list.printList(list);
        //list.head = x.rev(list.head,list.head);
        LinkedInt.Node temp=list.head;
        /*for (int i =0;i<5;i++) temp = temp.next;
        list.head = x.rev(list.head,temp);*/
        list.head = x.reverse(list,list.head,list.head,2);
        list.printList(list);

    }
}
