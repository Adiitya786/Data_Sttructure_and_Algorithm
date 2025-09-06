import java.util.ArrayList;

public class Pair_SumII {
  public static void isTar(ArrayList<Integer> arr, int target){
        int n = arr.size();
        int bp=-1;
        for(int i =0;i<arr.size();i++){
            if(arr.get(i)>arr.get(i+1)){
                bp =i;
                break;
            }

            
        }
        int lp=bp+1,rp =bp;
        while(lp!=rp){
                if(arr.get(lp)+arr.get(rp) == target){
                    System.out.println("index of both the elements of pair sum: " +lp+" and "+rp);
                    return;
                }
                else if(arr.get(lp)+arr.get(rp) <target){
                    lp = (lp+1)%n;
                }
                else{
                    rp= (rp+n-1)%n;
                }
        }
        System.out.println("No pair sum found...");
    }
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(11); 
        arr.add(12); 
        arr.add(7); 
        arr.add(8); 
        arr.add(9); 
        arr.add(10);
      isTar(arr, 20);
        
    }
}
