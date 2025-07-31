
import java.util.*;


public class Linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean found = false;
        System.out.println("enter the number of elements in an array: ");
        int n = sc.nextInt();
        int num[]= new int[n];
        System.out.println("enter the "+n+" elements: ");
        for(int i=0;i<num.length;i++){
            // inputing elements
            System.out.println("element "+(i+1)+": ");
            num[i]=sc.nextInt();
        }
        System.out.println("enter the searching element: ");
        int item = sc.nextInt();
        for(int i=0;i<num.length;i++){
            if(num[i]==item){
            System.out.println("element found at position: "+(i+1));
            found=true;
            break;
            }
        }
        if(!found){
            System.out.println("seaching element does not lies in the array.");
        }
        sc.close();
    }
    
}
