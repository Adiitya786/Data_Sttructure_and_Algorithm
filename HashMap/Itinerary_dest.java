import java.util.*;
public class Itinerary_dest {
     public static String getFirst( TreeMap<String,String> map){
         TreeMap<String,String> revMap = new TreeMap<>();
         for(String key : map.keySet()){
            revMap.put(map.get(key),key);
         }
         for(String key : map.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
         }
         return null;
    }
    public static void main(String[] args) {
          TreeMap<String,String> map = new  TreeMap<>();
      map.put("Chennai","Bengaluru");
      map.put("Mumbai","Delhi");
      map.put("Goa","Chennai");
      map.put("Delhi","Goa");
           
       
        String start = getFirst(map);
        System.out.print(start);
        for(String key : map.keySet()){
            System.out.print(" -> "+map.get(start));
            start = map.get(start);
        }
        
        

    }
}
