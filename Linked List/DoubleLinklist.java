public class DoubleLinklist {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next =null;
            this.prev =null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;

        // to add a new element in the first index of double linked list.
        public void addFirst(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                size++;
                return;
            }
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            size++;
        }
          // to add element in the last position of a linked list
         public void addLast(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                size++;
                return;
            }
            tail.next = newNode;
             newNode.prev = tail;
             tail = newNode;
             size++;

         }
          // to remove first element of a linked list
        public void removefirst(){
            if(head == null){
                return;
            }
            if(size ==1){
                head =tail = null;
                return;
            }
            head = head.next;
            head.prev = null;
        }
        // to remove last element of a linked list
        public void removeLast(){
            if(head == null){
                return;
            }
            if(size ==1){
                head =tail = null;
                return;
            }
            tail.prev.next = null;
            tail.prev = null;
            tail = tail.prev;
            
                
            
        }
         // to print the linked list
        public  void print(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" <-> ");
                temp = temp.next;
            }
            System.out.println("null");
            System.out.println();
        }
            public void reverse(){
            Node prev = null;
            Node curr = tail =head; //right to left assign values
            Node next;
            while(curr != null){
                next = curr.next;
                curr.next =prev;
                curr.prev = next;
                prev = curr;
                curr = next;
            }
            head = prev;
        }

    
        public static void main(String[] args) {
            DoubleLinklist dll  = new DoubleLinklist();
            dll.addFirst(3);
            dll.addFirst(2);
            dll.addFirst(1);
            dll.print();
            // dll.removefirst();
            // dll.print();
            dll.addLast(5);
          
            
            dll.reverse();
         dll.print();
    }
}
