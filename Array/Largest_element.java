import java.util.*;

public class Largest_element {
          public static  int find_largest(int num[],int n){
             int large = Integer.MIN_VALUE;
              for(int i=0;i<num.length;i++){
                if(large<num[i]){
                    large=num[i];
                }
              }
              return large;
          }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in an array: ");
        int n = sc.nextInt();
        int num[]= new int[n];
        System.out.println("enter the "+n+" elements: ");
        for(int i=0;i<num.length;i++){
            // inputing elements
            System.out.print("element "+(i+1)+": ");
            num[i]=sc.nextInt();
        }
         
          System.out.println( find_largest(num, n)+" is the largest element in the array .");
          sc.close();
    }
}
