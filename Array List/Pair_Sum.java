import java.util.ArrayList;

public class Pair_Sum {

    public static void isTar(ArrayList<Integer> arr, int target){
        int n = arr.size();
        int lp=0,rp =n-1;
        while(lp<rp){
                if(arr.get(lp)+arr.get(rp) == target){
                    System.out.println("index of both the elements of pair sum: " +lp+" and "+rp);
                    return;
                }
                else if(arr.get(lp)+arr.get(rp) <target){
                    lp++;
                }
                else{
                    rp--;
                }
        }
        System.out.println("No pair sum found...");
    }
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(1); 
        arr.add(2); 
        arr.add(3); 
        arr.add(4); 
        arr.add(5); 
        arr.add(6);
      isTar(arr, 4);
    }
}
