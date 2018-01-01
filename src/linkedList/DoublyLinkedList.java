package linkedList;

public class DoublyLinkedList {

    int length;
    Node head;

    DoublyLinkedList(){
        length = 0;
    }


    class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
            data = d;
        }
    }

    public void insertAtBeginning(int data){
        Node newNode = new Node(data);

        newNode.next = head;
        newNode.prev = null;

        if(head != null){
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertAtEnd(int data){

        Node newNode = new Node(data);
        newNode.next = null;

        if(head==null){
            head = newNode;
        }

        Node last = head;


        while(last.next!=null){
            last  = last.next;
        }

        newNode.prev = last;
        last.next = newNode;

    }


    public void display(){
        Node last = head;
        // Again Remember not last.next...
        while(last!=null){
            System.out.print(last.data+" --> ");
            last = last.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();

        dl.insertAtBeginning(12);
        dl.insertAtEnd(22);
        dl.insertAtEnd(88);
        dl.display();
    }

}
