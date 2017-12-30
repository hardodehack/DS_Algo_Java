package linkedList;


public class LinkedListADT {

    public LinkedListADT(){
        length = 0;
    }

    private int length;

    LinkNode head;

    public synchronized String toString(){

        String result="";

        if(head==null)return "["+result;

        result+=head.getData()+" , ";
        LinkNode temp = head.getNext();

        while(temp!=null){
            result+=temp.getData()+" , ";
            temp = temp.getNext();
        }
        return result;
    }

    public synchronized void display(){
        LinkNode temp = head;
        while(temp!=null){


            temp = temp.getNext();

        }
    }

    public synchronized LinkNode getHead(){
        return head;
    }


    public void insertAtBeginning(LinkNode node) {
        node.setNext(head);
        head = node;
        length++;
    }

    public synchronized void insertAtEnd(LinkNode node){
        if(head==null){
            head=node;
        }else{
            LinkNode p,q;
            for(p=head;(q=p.getNext())!= null;p=q) {
                p.setNext(node);
                node.setNext(null);
            }

        }
        length++;
    }

    public void insertAtPosition(int data,int position){
         if(position<0)
             position = 0;

         if(position>length)
             position = length;

         if(head==null) {
             head = new LinkNode(data);
         } else if(position==0){
             LinkNode temp = new LinkNode(data);
             temp.setNext(head);
             head = temp;
         }else{

             LinkNode temp = head;
             for(int i=1;i<position;i++){
                 temp = temp.getNext();
             }

             LinkNode newNode = new LinkNode(data);
             // Here We have used next from LinkNode.
             newNode.next = temp.next;
             temp.setNext(newNode);
         }
        length++;
    }

    public synchronized LinkNode removeFromTheBeginning(){

        LinkNode node = head;

        while(node!=null){
            head = node.getNext();
            node.setNext(null);
        }
        return node;
    }

    public synchronized void add(int data){


        LinkNode new_node = new LinkNode(data);

        if(head==null){
            head = new_node;

        }

        LinkNode last = head;

        while(last.next!=null){
            last = last.next;
        }

        last.next = new_node;
    }




    public static void main(String[] args) {
        LinkedListADT ll = new LinkedListADT();

        LinkNode n = new LinkNode(12);
        LinkNode n2 = new LinkNode(13);



        //ll.insertAtBeginning(n);
        /*
        ll.insertAtPosition(17,3);
        ll.insertAtEnd(n2);
          ll.display();
          ll.removeFromTheBeginning();
          ll.display();*/

        /*ll.insertAtBeginning(n);
        ll.insertAtEnd(n2);
        ll.insertAtEnd(n);
        ll.insertAtEnd(n2);*/

        ll.add(12);
        ll.add(13);
        ll.add(14);
        System.out.println(ll.toString());

    }

}
