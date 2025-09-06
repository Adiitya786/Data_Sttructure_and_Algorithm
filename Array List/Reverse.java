
import java.util.*;
public class Reverse {
     public static void main(String[] args) {
       ArrayList<Integer>num = new ArrayList<>();
        num.add(1);
        num.add(2); // to add element in the array.
        num.add(3);
       
        num.add(4);
        num.add(5);
        int right =num.size()-1;
        for(int i=0;i<num.size()/2;i++){
            int temp = num.get(i);
            num.set(i,num.get(right));
            num.set(right,temp);
            right--;

        }
         for(int i=0;i<num.size();i++){
            System.out.print(num.get(i)+" ");
         }
     }
}
