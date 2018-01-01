package stack;

public class StackUsingLinkedList {

    StackUsingLinkedList(){
        top = -1;
    }

    int top;

    // For LinkedList
    Node head;
    public class Node{

        int data;
        // In Actual we are using SinglyLinkedList with previous pointer, not next...
        Node prev;

        Node(int d){
            data = d;
        }
    }

    public boolean push(int data){
        System.out.println("Executing push operation for "+ data);
        Node newNode = new Node(data);

        Node oldHead = head;

        head = newNode;
        // // // // // // // // // // // // // // //
        head.prev = oldHead;
        // // // // // // // // // // // // // // //
        return true;
    }

    public int pop(){
        System.out.println("Executing pop operation");

        if(head==null){
            System.err.println("Uhhh Stack UnderFlow...");
            return  0;
        }

        int dataForPop = head.data;
        // // // // // // // // // // // // // // //
        head = head.prev;
        // // // // // // // // // // // // // // //
        return dataForPop;
    }

    public static void main(String[] args) {
        StackUsingLinkedList sll = new StackUsingLinkedList();
        sll.push(12);
        sll.push(13);
        sll.push(14);
        sll.push(15);
        sll.push(16);

        System.out.println(sll.pop());
        System.out.println(sll.pop());
        System.out.println(sll.pop());
        System.out.println(sll.pop());
        System.out.println(sll.pop());
        System.out.println(sll.pop());
    }

}
