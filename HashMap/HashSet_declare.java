import java.util.*;
public class HashSet_declare {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(2);
        System.out.println(hs);
        hs.remove(4);
        System.out.println(hs.contains(4));
        hs.clear();
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());
    }
}
