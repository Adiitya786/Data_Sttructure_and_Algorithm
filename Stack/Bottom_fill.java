import java.util.*;
public class Bottom_fill {

    // to push the element at the bottom of the stack.
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){ // Base case
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);  // Recursion
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(s,4);
         while(!s.isEmpty()){
            System.out.println(s.pop());
         }
    }
}
