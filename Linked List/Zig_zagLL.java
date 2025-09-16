
public class Zig_zagLL {
    
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
        public static int size;


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


        public static Node  getMid(Node head){
              Node slow = head;
            Node fast = head.next;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
  
    public  void zigZag(){
        // get mid
           Node mid = getMid(head);
          
            // reverse the right half part
                Node curr = mid.next;
                mid.next = null;
           Node prev = null;
           Node next;
           while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
             curr = next;
           }
            // add elements one by alternate merging from one list and another list
          Node left = head;
          Node right = prev;
          Node nextL ,nextR;
          while(left != null && right != null){
                nextL = left.next;
                left.next = right;
                nextR = right.next;
                right.next = nextL;

                left = nextL;
                right = nextR;
          }
    }
    public static void main(String[] args) {
       Zig_zagLL ll = new Zig_zagLL();
        
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
       ll.print();
       // 1-> 2 -> 3-> 4-> 5
        ll.zigZag();
        ll.print();
        // 1-> 5 -> 2-> 4 -> 3
    }
}
