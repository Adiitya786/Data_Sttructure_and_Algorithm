import java.util.*;
public class declare {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India", 100); // to add a key value pair in a  Hashmap
        hm.put("China", 150);
        hm.put("US", 50);
        System.out.println(hm);
        System.out.println(hm.containsKey("India"));  // to check whether key is present or not.
        hm.remove("China"); // to remove a key value pair from Hashmap by passing a key
        System.out.println(hm);
        System.out.println(hm.size()); // to get the size of a Hashmap...
        System.out.println(hm.isEmpty()); // to check whether a Hashmap is empty or not.
    }
}
