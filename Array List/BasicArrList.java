import java.util.*;

public class BasicArrList {
    public static void main(String args[]){
        ArrayList<Integer>num = new ArrayList<>();
        num.add(1);
        num.add(2); // to add element in the array.
        num.add(3);
        System.out.println(num);
        num.add(4);
        num.add(5);
        System.out.println(num);
        int element = num.get(3); // to get the element at particualr index.
        System.out.println(element);
        num.remove(3);  // to remove element from particular index.
        System.out.println(num);
        num.set(3,11);  // to set the element at the index by removing the previous element.
        System.out.println(num);
        System.out.println(num.contains(11));  // to check whether the element is present in the arraylist or not.
        System.out.println(num.contains(15));
        num.add(3,4);   // to add the element at the given index and shifts the rest of the elements.
        System.out.println(num);
    }
}
