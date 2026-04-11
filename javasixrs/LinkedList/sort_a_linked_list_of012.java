 class Node {
        int data;
        Node next;
        Node(int new_data){
            data= new_data;
            next= null;
        }
    }
public class sort_a_linked_list_of012 {
   
    // Function to sort a linked list of 0s, 1s and 2s

    static Node sortList(Node head){
        if(head== null ||  head== null) return head;

        Node zeroD= new Node(0);
        Node oneD = new Node(0);
        Node twoD = new Node(0);


        Node zero=zeroD, one=oneD, two= twoD;

        Node curr= head;
        while(curr!=null){
            if(curr.data==0){
                zero.next= curr;
                zero= zero.next;
            }
            else if(curr.data==1){
                one.next= curr;
                one= one.next;
            }
            else{
                two.next= curr;
                two= two.next;
            }
            curr= curr.next;

        }
        zero.next= (oneD.next!=null) ? oneD.next : twoD.next;
        one.next= twoD.next;
        two.next= null;

        head= zeroD.next;
        return head;


    }
// function to print the linked list
    static void printList(Node node){
        while(node != null){
            System.out.print(" " + node .data);
            node = node.next;
        }
        System.out.println();
    }
public static void main(String[] args) {
    Node head = new Node (1);
    head.next= new Node(1);
    head.next.next= new Node(2);
    head.next.next.next= new Node(1);
    head.next.next.next.next= new Node(0);

    System.out.print("Limked List before sorting:");
    printList(head);

    head= sortList(head);
    System.out.print("Limked List after sorting:");
     printList(head);
}
}
