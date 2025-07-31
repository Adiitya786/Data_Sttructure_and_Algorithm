import java.util.Scanner;

public class Binary_search {
    public static int binary_search(int arr[],int n,int item){
        int start =0,end=n-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if(arr[mid]==item){
                return mid;
            }
             if(arr[mid]<item){
                start=mid+1;
            }
            else{
                end =mid-1;
            }
        }
        return -1;
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
        System.out.println("enter the searching element: ");
        int item = sc.nextInt();
        int index = binary_search(arr, n, item);
        if(index==-1){
        System.out.println("searching element is not found in the array.");}
        else{
            System.out.println("element "+item+ " is found at position: "+(index+1));
        }
        sc.close();
    }
    
}
