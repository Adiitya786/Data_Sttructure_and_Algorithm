import java.util.*;


public class Indian_coins {
     public static void coinChange(int[] coins, int amount,ArrayList<Integer>arr,int max) {
        
        if(amount ==0){
            return ;
        }

        
        for(int i =coins.length-1;i>=0;i--){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    max++;
                    arr.add(coins[i]);
                    amount-=coins[i];
                }
            }

        }

        System.out.println("minimum number of notes uses: "+max);
        System.out.println("notes used in payment are: ");
        for(int i =0;i<arr.size();i++){
            System.out.println(arr.get(i)+" ");
        }
  

    }

    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();
        int coins[] = {1,2,5,10,20,50,100,500,2000};
       
        coinChange(coins, 590, new ArrayList<>(),0);
    }
}

