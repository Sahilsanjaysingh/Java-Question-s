



package stack;

public class stacck {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class Stack {
        Node top;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = top;
            top = temp;
        }

        int pop() {
            if (top == null) {
                System.out.println("Stack Underflow");
                return -1;
            }

            int val = top.data;
            top = top.next;
            return val;
        }

        int peek() {
            if (top == null) {
                System.out.println("Stack Empty");
                return -1;
            }
            return top.data;
        }

        boolean isEmpty() {
            return top == null;
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(5);
        s.push(10);
        s.push(15);

        System.out.println("Top: " + s.peek());
        System.out.println("Pop: " + s.pop());
        System.out.println("Top after pop: " + s.peek());
    }
}