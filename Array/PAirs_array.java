import java.util.Scanner;

public class PAirs_array{
    public static void pairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            int current =i;
            for(int j= i+1;j<arr.length;j++){
                System.out.println("("+arr[current]+","+arr[j]+")");
            }
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in an array: ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("enter the "+n+" elements: ");
        for(int i=0;i<arr.length;i++){
            // inputing elements
            System.out.print("element "+(i+1)+": ");
            arr[i]=sc.nextInt();
        }
        System.out.println("pairs in array: ");
        pairs(arr);
         
    }
}