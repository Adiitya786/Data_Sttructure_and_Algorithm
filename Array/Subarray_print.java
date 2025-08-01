//import java.util.Scanner;

public class Subarray_print {
    public static void subarray(int arr[]){
        int ts=0;
        for(int i =0;i<arr.length;i++){
            int start =i;
            
            for(int j=i;j<arr.length;j++){
                int end= j;
                for(int k=start;k<=end;k++){ // print only 
                     System.out.print(""+arr[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total no. of subarrays: "+ts);
    }
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        int arr[] = {2,4,6,8,20};
        subarray(arr);
    }
}
