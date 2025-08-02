import java.util.Scanner;

public class MAx_subarray {
    public static void  subarray_max_print(int arr[]){
        int max_sum = Integer.MIN_VALUE;
        int curr_sum =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                curr_sum=0;
                for(int k=i;k<=j;k++){
                    curr_sum=curr_sum+arr[k];
                }
                 System.out.println("current sum "+i+" index to "+j+"=  "+curr_sum);
                 if(curr_sum>max_sum){
                    max_sum=curr_sum;
                }
                
            }
        }
        System.out.println("maximum sum of a subarray: "+max_sum);
    }
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements: ");
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements: ");
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
          subarray_max_print(arr);
          sc.close();
       }
}
