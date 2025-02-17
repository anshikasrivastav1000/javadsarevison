package LinkedList;


class Node
{
    public int val;
    public Node next;
    public Node(int value){
        val = value;
        next = null;
    }
}
public class NodeCreate {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        head.next = secondNode;
        secondNode.next = thirdNode;
        Node temp = head;
        while (temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        temp = head;
        while (temp != null){
            System.out.println(temp.val);
            temp = temp.next;

        }

    }
}
