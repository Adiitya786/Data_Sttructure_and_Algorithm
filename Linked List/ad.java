
public class ad {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
        private Node head;
        private Node tail;

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
         
        public void print(){
            Node temp = head;
            if(head == null){
                System.out.println("Linked List if empty....");
            }
            while(temp != null){
                System.out.println(temp.data+" ");
             temp = temp.next;
            }
            System.out.println();
        }
        public static void main(String[] args) {
            ad ll = new ad();
           ll.addfirst(2);
           ll.print();
        }
    }

