public class Selection_sort {

    public static void sorting_selection(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            int min_pos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min_pos]>arr[j]){   // if we want decreasing order, then only reverse the sign(<).
                    min_pos=j;
                }
            }
            // swapping
            int temp = arr[min_pos];
            arr[min_pos]=arr[i];
            arr[i]=temp;

        }
    }

     public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
       }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        sorting_selection(arr);
        printarray(arr);

    }
}
