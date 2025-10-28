import java.util.*;
public class Min_abs_diff {
    public static void main(String[] args) {
        int A[] ={4,1,8,7};
        int B[] ={2,3,6,5};
         int absDiff =0;
        Arrays.sort(A);
        Arrays.sort(B);

        for(int i =0;i<A.length;i++){
            absDiff += Math.abs(A[i]-B[i]);
        }
        System.out.println("sum of minimum absolute difference pair from two array elements :  "+absDiff);
    }
}
