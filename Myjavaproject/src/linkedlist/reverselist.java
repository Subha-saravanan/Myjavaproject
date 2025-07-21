package linkedlist;

class Node {
    int data;
    Node next;
    Node(int value) {
        this.data = value;
        this.next = null;
    }
}



public class reverselist{
    public static Node reverseList(Node head) {
    Node curr=head;
    Node prev=null;
    while(curr!=null){
        
    Node front=curr.next;
    curr.next=prev;
    prev=curr;
    curr=front;
    }
    return prev;
}
public static void oList(Node head) {
    Node curr=head;
   // Node prev=null;
    while(curr!=null){
     System.out.print(curr.data+" ");
     curr=curr.next;
    }
   System.out.println();// return head;
}

        
        
}