import java.util.Scanner;

public class Duplicate_element{
               public static boolean atleast_twice_element(int num[]){
                      for(int i=0;i<num.length-1;i++){
                        for(int j=i+1;j<num.length;j++){
                            if(num[i]==num[j]){
                                return true;
                            }
                        }
                      }
                      return false;
               }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in an array: ");
        int n = sc.nextInt();
        int num[]= new int[n];
        System.out.println("enter the "+n+" elements: ");
        for(int i=0;i<num.length;i++){
            // inputing elements
            System.out.println("element "+(i+1)+": ");
            num[i]=sc.nextInt();
        }
         System.out.println(atleast_twice_element(num));
         sc.close();
    }
}