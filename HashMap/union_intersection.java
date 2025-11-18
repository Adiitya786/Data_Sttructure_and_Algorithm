import java.util.*;
public class union_intersection {
    public static HashSet<Integer> set = new HashSet<>();
    public static void unionfind(int arr1[], int arr2[]){
        for(int i =0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i =0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.println("Union of array1 and array2 : ");
        for(Integer n : set){
            System.out.print(n+" ");
        }
        System.out.println();
        set.clear();
    }
    public static void intesecfind(int arr1[],int arr2[],ArrayList<Integer> nums){
         for(int i =0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        int count =0;  // count of total intersection elements.
        for(int i =0;i<arr2.length;i++){
             if(set.contains(arr2[i])){
                count++;
                nums.add(arr2[i]);
                set.remove(arr2[i]);
             }
        }
        System.out.println("Intersection of array1 and array2 : ");
        for(Integer el : nums){
            System.out.print(el+" ");
        }
    }
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        unionfind(arr1,arr2);
        intesecfind(arr1,arr2,new ArrayList<>());
    }
}
