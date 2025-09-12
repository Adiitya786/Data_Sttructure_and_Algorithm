
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
        public static int size;  // automatically size initializes with 0.
        

        public void addfirst(int data){
           // creating a new node
            Node newNode = new  Node(data);
            size++;
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
            size++;
            if(head == null){
                    head = tail = newNode;
                    return;
            }
            tail.next = newNode;
            tail = newNode;
        }
         
        public void addMiddle(int idx,int data){
            
            if(idx ==0){
                addfirst(data);
                return;
            }
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i =0;
            while(i<idx-1){
                    temp = temp.next;
                    i++;
            }
             newNode.next = temp.next;
             temp.next = newNode;
        }

        public int removeFirst(){
            if(size ==0){
                System.out.println("ll is empty");
                return Integer.MAX_VALUE;
            }
            if(size ==1){
                int val = head.data;
                head = tail = null;
                size =0;
                return val;
            }
            int val = head.data;
                head = head.next;
                size--;
                return val;
        }
        public int removelast(){
               if(size ==0){
                System.out.println("ll is empty");
                return Integer.MAX_VALUE;
            }
            if(size ==1){
                int val = head.data;
                head = tail = null;
                size =0;
                return val;
            }
            Node prev = head;
            for(int i =0;i<size-2;i++){
                prev = prev.next;
            }
            int val = prev.next.data;
            prev.next = null;
            tail = prev;
            size--;
            return val;
        }
        public void print(){
            Node temp = head;
            if(head == null){
                System.out.println("Linked List is empty....");
            }
            while(temp != null){
                System.out.print(temp.data+"-> ");
             temp = temp.next;
            }
            System.out.println("null");
        }
        public static void main(String[] args) {
            ad ll = new ad();
            // ll.print();
           ll.addfirst(2);
        //    ll.print();
           ll.addfirst(1);
        //    ll.print();
           ll.addlast(3);
        //    ll.print();
           ll.addlast(4);
           ll.addMiddle(3, 8);
          
        //    System.out.println("Size of the linked list: "+size);
         ll.print();
           ll.removeFirst();
           ll.print();
           ll.removelast();
           ll.print();
            System.out.println("Size of the linked list: "+size);
        }
    }

