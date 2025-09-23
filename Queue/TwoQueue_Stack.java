import java.util.*;
public class TwoQueue_Stack {
    static class Stack{
        static Queue<Integer> q1 =new LinkedList<>() ;
        static Queue<Integer> q2 =new LinkedList<>() ;
            
        public static boolean isEmpty(){
            return q1.isEmpty();
        }
        public static void add(int data){
            while(!q1.isEmpty()){
                q2.add(q1.remove());
                        }
                        q1.add(data);
                        while(!q2.isEmpty()){
                            q1.add(q2.remove());
                        }
        }

        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty...");
                return -1;
            }
            return q1.remove();
        }

        public static int peek(){
              if(isEmpty()){
                System.out.println("Stack is empty...");
                return -1;
            }
            return q1.peek();
        }


      
    }


    public static void main(String[] args) {
        Stack s = new Stack();
        s.add(1);
        s.add(2);
        s.add(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
