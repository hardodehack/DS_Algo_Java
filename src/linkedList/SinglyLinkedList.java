package linkedList;

public class SinglyLinkedList {

    private Node head;
    private int length;

    public int getLength(){
        return length;
    }

    SinglyLinkedList(){
        length = 0;
    }

    // Inner Class for better Readability...
    class Node{

        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public void insertionAtPosition(int data,int position){

        Node newNode = new Node(data);
        Node temp = head;

        if(position<0)
            position = 0;

        if(position>length)
            position=length;

        // If Node is Empty.
        if(head == null){
            head = newNode;
            return;

            // Have a double check here with not empty LL...
        }else if(position==0){
            newNode.next = head;
            head = newNode;


        }else{
            for(int i=1;i<position;i++){
                temp = temp.next;
            }

            newNode.next = temp.next;
            temp.next = newNode;

        }

        length++;
    }

    public void insertAtBeginning(int i){
        Node newNode = new Node(i);
        head = newNode;
        length++;
    }

    // Add Method or insertionAtLast Method....
    public void add(int i){

        Node newNode = new Node(i);

        // If Node is Empty.
        if(head == null){
            head = newNode;
            length++;
            return;
        }

        // Set next of new node as a null, b'coz it will be last node.
        newNode.next = null;

        Node last = head;

        while(last.next!=null){
            last = last.next;
        }
        last.next = newNode;
        length++;
        return;
    }

    public Node removeFromTheBeginning(){
        if(head==null){
            System.out.println("LL is Empty...");
            return null;
        }

        if(head.next==null){
            Node temp = head;
            head=null;
            System.out.println("Removed one and only element, now list is Empty...");
            return temp;
        }

            Node temp = head;
            head = head.next;
            return temp;
    }

    public Node removeFromEnd(){
        if(head==null){
            System.out.println("LL is Empty...");
            return null;
        }

        Node temp = head;

        if(head.next==null){
            head=null;
            System.out.println("Removed one and only element, now list is Empty...");
            return temp;
        }

        while(temp!=null){
            temp = temp.next;

        }

        temp = null;


        return temp;
    }


    public void display(){
        if(head==null){
            System.out.println("Empty LinkedList");
        }
        Node last = head;
        // Here don't use last.next, otherwise it will not print last element. Only useful for add method.
        while(last!=null){
            System.out.print(last.data+" --> ");
            last = last.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();

        ll.insertAtBeginning(12);
        ll.add(22);
        ll.add(26);
        ll.insertionAtPosition(99,0);
        ll.display();
        System.out.println();

        ll.removeFromTheBeginning();

        ll.display();
        System.out.println();

        ll.removeFromEnd();

        ll.display();
    }

}
