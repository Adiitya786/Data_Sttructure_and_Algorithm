import java.util.Scanner;

public class Reverse_array {
    public static void Reverse(int arr[]){
        int first =0;
        int last=arr.length-1;
        while(first<last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of element: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements: ");

        for(int i=0;i<n;i++){
            System.out.println("Element "+(i+1)+": ");
            arr[i]= sc.nextInt();
        }
        Reverse(arr);
        System.out.println("Reverse array: \n");
         for(int i=0;i<n;i++){ 
            System.out.println(arr[i]+"  ");    
            }
            sc.close();
    }   
}
