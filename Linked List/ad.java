
public class ad {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
        public static Node head;
        public static Node tail;
        

        public void addfirst(int data){
           // creating a new node
            Node newNode = new  Node(data);
            if(head == null){
                    head = tail = newNode;
                    return;
            }
            // assigning pointer to next node
            newNode.next = head;
           // changed  head to new node
            head = newNode;
        }
        public void addlast(int data){
            Node newNode = new  Node(data);
            if(head == null){
                    head = tail = newNode;
                    return;
            }
            tail.next = newNode;
            tail = newNode;
        }
         
        public void addMiddle(int idx,int data){
            Node newNode = new Node(data);
            Node temp = head;
            int i =0;
            if(idx ==0){
                addfirst(data);
                return;
            }
            while(i<idx-1){
                    temp = temp.next;
                    i++;
            }
             newNode.next = temp.next;
             temp.next = newNode;
        }
        public void print(){
            Node temp = head;
            if(head == null){
                System.out.println("Linked List is empty....");
            }
            while(temp != null){
                System.out.println(temp.data+" ");
             temp = temp.next;
            }
            System.out.println();
        }
        public static void main(String[] args) {
            ad ll = new ad();
            ll.print();
           ll.addfirst(2);
           ll.print();
           ll.addfirst(1);
           ll.print();
           ll.addlast(3);
           ll.print();
           ll.addlast(4);
           ll.addMiddle(3, 8);
           ll.print();
           
        }
    }

