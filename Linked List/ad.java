
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
        
    //  for adding elements in the first position of a linked list. 
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

        // for adding elements in the last of the linked list.
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
         // for adding elements in the midddle of the linked list
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
    
        // for removing the first element of a linked list
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
        // for removing the last element of a linked list
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

         // for printing the linked list
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

        // for iterative search in a linked list
             public  int itrsearch(int key){
            Node temp = head;
            int i =0;
            if(head == null){
                System.out.println("empty ll..");
                return -1;
            }
            while(temp != null){
                if(temp.data == key){
                    return i;
                }
                else{
                    temp = temp.next;
                    i++;
                }
            }
            return -1;
        }

        public int helper(Node head,int key){
            if(head == null){
                return -1;
            }
            if(head.data == key){
                return 0;
            }
            int idx = helper(head.next, key);
            if(idx == -1){
                return -1;
            }
            return idx+1;

        }
        // for recursive search in a linked list
        public int recsearch(int key){
            return helper(head,key);
        }

        //  for reversing a linked list
        public void reverse(){
            Node prev = null;
            Node curr = tail =head; //right to left assign values
            Node next;
            while(curr != null){
                next = curr.next;
                curr.next =prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }

        public void removeNfromEnd(int n){
            int sz =0;
            Node temp = head;
            while(temp != null){
                temp = temp.next;
                sz++;
            }
            if(n == sz){
                head = head.next; // remove first
                return;
            }
            int  i =1;
            int idfFromfst = sz-n;
            Node prev  = head;
            while(i<idfFromfst){
                    prev = prev.next;
                    i++;
            }
            prev.next = prev.next.next;
            return;
        }
        public Node Mid(Node head){

            // slow fast approach
            Node slow = head;
            Node fast = head;
            while(fast != null && fast.next != null){
                slow = slow.next;  //+1
                fast = fast.next.next;  // +2
            }
            return slow;
        }
        public boolean isPalindrome(){
            if(head == null || head.next == null){
                return true;
            }
            //find mid
             Node Midnode =  Mid(head);
            // reverse the second half
              Node prev = null;
              Node curr = Midnode;
              Node next;
              while(curr != null){
                    next = curr.next;
                    curr.next = prev;
                    prev = curr; 
                    curr = next;
              }
             
            // compare with the left and right
           
            Node right  = prev;
             Node left = head;
            while(right != null){
                if(left.data != right.data){
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
        }
        public static void main(String[] args) {
            ad ll = new ad();
        
           ll.addlast(1);
        
           ll.addlast(2);

           ll.addlast(2);
           ll.addlast(1);
           ll.print();
           System.out.println(ll.isPalindrome());
        }
    }

