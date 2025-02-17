package LinkedList;

public class InsertAtEnd {
    Node insertAtEnd(Node head,int x){
        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        Node newNode = new Node(x);
        temp.next = newNode;

        return head;
    }

}
