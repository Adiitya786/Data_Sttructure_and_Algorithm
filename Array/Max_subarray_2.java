import java.util.Scanner;

public class Max_subarray_2 {
    // less time complexity than simple subarray sum finding.
    public static void  subarray_max_By_prefix(int arr[]){
        int max_sum = Integer.MIN_VALUE;
        int curr_sum =0;
        int prefix[] = new int[arr.length];   // making an prefix array.
        prefix[0]= arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]= prefix[i-1]+arr[i];       //  sum of all previous values are stored.
        }
        for(int i=0;i<arr.length;i++){
            int start =i;
            curr_sum=0;
            for(int j=i;j<arr.length;j++){
                int end =j;
                //  if start =0,then [start-1] becomes -1, which is not an index.
                curr_sum= start==0? prefix[end]: prefix[end]-prefix[start-1];     
                
                
                }
                if(curr_sum>max_sum){
                    max_sum=curr_sum;
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
          subarray_max_By_prefix(arr);
          sc.close();
}
}