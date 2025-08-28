public class Merge_sort{

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void merge(int arr[],int si, int mid, int ei){
        int i=si; // index for left merge
        int j=mid+1;// index for right merge
        int k=0;    // for temp indexing
        int temp[] = new int[ei-si+1];
        while (i<=mid && j<=ei) {

            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
                
            }
            // for leftover elements in left array
            while(i<=mid){
                temp[k++] = arr[i++];
            }
            while(j<=ei){
                temp[k++] = arr[j++];
            }
             for(k=0, i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }

    }
    public static void mergesort(int arr[], int si, int ei){
        // Base case
        if(si>= ei){
            return;
        }
        //kaam
        int mid = si + (ei-si)/2;
        mergesort(arr, si, mid); //left sort
        mergesort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
    public static void main(String[] args) {
        int arr[] = {3,-2,5,2,6,8,9};
        mergesort(arr, 0, arr.length-1);
        printArray(arr);

    }
}