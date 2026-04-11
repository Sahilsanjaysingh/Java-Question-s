


public class ll {
    private static void display(Node head){
        // Node temp=head;
        // while(temp!=null){
        //     System.out.print(temp.data);
        //     temp= temp.next;
        // }
        if(head==null)return ;
        display(head.next);
        System.out.print(head.data + " ");
    }
    static class Node{
        int  data;// value
        Node next;// address of next node
        Node (int data){
            this.data=data;

        }
    }
    public static void main(String[] args) {
        // Node x= new Node();
        // System.out.println(x.next);
        Node a = new Node(5); 
        Node b = new Node(3); 
        Node c = new Node(9); 
        Node d = new Node(8); 
        Node f = new Node(16); 

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=f;
        f.next=null;
        System.out.println(b.next.next.next.data);



        // Traversing a linked list
        Node temp=a;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        //  System.out.println(" ");

        // Node temp2= a;
        // while(temp2!=null){
        //     System.out.print("temp2 data"+temp2.data+"");
        //     temp2= temp2.next;
        // }



System.out.println("");
        //traversing a linked list using for loop
        Node temp1=a;
        for(int i=1; i<=5; i++){
            System.out.print(temp1.data+" ");
            temp1=temp1.next;
        }

        System.out.println("");
        // Node temp3= a;
        // for(int i=5; i>=5 ; i--){
        //     System.out.println(+temp3.data+"");
        //     temp3= temp3.next;
        // }

        //diplay using 
           display(a);


           //search an element in the linked list
           Node ser=a;
           
           while(ser!=null){
            if(ser.data==16){
                System.out.println("Element foundat "+ ser + " this is a address of the element ");
                break;
            }
            ser=ser.next;
           }
    }
}
