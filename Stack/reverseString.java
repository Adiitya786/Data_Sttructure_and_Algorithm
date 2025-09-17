import java.util.Stack;

public class reverseString {


    // for reversing in stack, we just only want to add elements by push and print it using pop method.
    public static String revStr(String str){
        Stack<Character> s = new Stack<>();
        int idx =0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        // store in string builder to get easier to store the reverse value.
        StringBuilder res = new StringBuilder();
        while(!s.isEmpty()){
            char curr = s.pop();
            res.append(curr);
        }
         return res.toString();
    }
    public static void main(String[] args) {
        String str = "Sigma male";
        String reverse = revStr(str);
        System.out.println(reverse);
    }
}
