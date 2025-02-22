package LinkedList;

public class NthNodeFromEnd {
    private static Node nthNode(Node head ,int n) {
    int size =0;
    Node temp = head;
    while (temp != null){
        size++;
        temp = temp.next;
    }
    int m = size - n + 1;
    //mth node from start
        temp = head;
        for(int i =1;i<=m;i++){
            temp = temp.next;
        }
        return  temp;
    }
    public static  Node nthNode2(Node head,int n){
        Node slow = head;
        Node fast = head;
        for (int i =1;i<=n;i++){
            fast = fast.next;
        }
        while (fast !=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static  Node deleteNodeTtFromEnd(Node head,int n){
        Node slow = head;
        Node fast = head;
        for (int i = 1;i<=n;i++){
            fast = fast.next;
        }
        if (fast == null){
            head = head.next;
            return head;
        }
        while (fast.next!=null){
           slow = slow.next;
           fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static class Node{
      int data;
      Node next;
      Node(int data){
          this.data = data;
      }
    }
    public static void  display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
    Node a = new Node(100);
        Node b = new Node(80);
        Node c = new Node(60);
        Node d = new Node(40);
        Node e = new Node(20);
        a.next =b;
        b.next =c;
        c.next = d;
        d.next=e;
        Node q = nthNode2(a,3);
        System.out.println(q.data);
        display(a);
     a = deleteNodeTtFromEnd(a,5);
        display(a);



}}
