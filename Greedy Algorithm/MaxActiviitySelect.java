import java.util.*;

public class MaxActiviitySelect{
    public static void main(String[] args) {
        int start[]=  {1,3,0,5,8,5};
        int end[]=  {2,4,6,7,9,9};
        int maxAct = 0;
         ArrayList<Integer>arr = new ArrayList<>();

         maxAct = 1;  // 1st activity automatically count
         arr.add(0);
         int  lastend = end[0];

         for(int i =1;i<end.length;i++){
                if(start[i] >= lastend){
                    maxAct+=1;
                    arr.add(i);
                    lastend = end[i];
                }
         }

         System.out.println("Maximum activity performed: "+ maxAct);
         System.out.println("Activity time: ");
         for(int i =0;i<arr.size();i++){
            System.out.println("A"+arr.get(i)+" ");
         }

    }
}