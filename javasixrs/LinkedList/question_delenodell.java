import org.w3c.dom.Node;

public class question_delenodell {
    class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}


                 // write your code here 
class GfG{
    static void deleteNode(Node delNode){
        if(delNode==null || delNode.next==null){
            return ;
        }

    }
}
    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
         // Creating a linked list: 4 -> 5 -> 6 -> 7 -> 8
        Node head = new Node(4);
        head.next = new Node(5);
        head.next.next = new Node(6);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(8);

        deleteNode(head);

        printList(head);
    }
}
