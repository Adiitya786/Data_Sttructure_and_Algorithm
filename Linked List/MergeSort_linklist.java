
public class MergeSort_linklist {

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
   
        public static Node getMid(Node head){
            Node slow = head;
            Node fast = head.next;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        public static Node merge(Node head1, Node head2){
             Node mergedlist = new Node(-1);
             Node temp = mergedlist;
             while(head1 != null && head2 != null){
                if(head1.data<=head2.data){
                    temp.next = head1;
                    head1 = head1.next;
                    temp = temp.next;
                }
                else{
                    temp.next = head2;
                    head2 = head2.next;
                    temp = temp.next;
                }
             }
             while(head1 != null){
                 temp.next = head1;
                    head1 = head1.next;
                    temp = temp.next;
             }
             while(head2 != null){
                temp.next = head2;
                    head2 = head2.next;
                    temp = temp.next;
             }
             return mergedlist.next;
        }
        public static Node mergesort(Node head){
                if(head == null || head.next == null ){
                    return head;
                }
                //mid
                Node mid = getMid(head);

                //right and left half
               Node rightHead = mid.next;
               mid.next = null;

               Node newleft = mergesort(head);
               Node newright = mergesort(rightHead);
                // merge sort
              return merge(newleft,newright);
        }
        public static void main(String[] args) {
            
        MergeSort_linklist ll = new MergeSort_linklist();
        ll.addlast(4);
        ll.addlast(1);
        ll.addlast(8);
        ll.addlast(2);
        ll.addlast(7);
        ll.print();
        ll.head = ll.mergesort(ll.head);
       
        ll.print();
    }
}
