public class Array_backtrack{

    public static void arraytrack(int arr[],int i,int val){
        //base case
       if(i==arr.length){
        printarray(arr);
        return;
       }

        //recursive case
        arr[i]=val;
        arraytrack(arr, i+1, val+1);
        arr[i]=arr[i]-2;
    }

    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
            public static void main(String[] args) {
                int arr[] = new int[5];
                arraytrack(arr,0,1);
                System.out.println();
                 printarray(arr);
            }    
}
