public class Sorted {

    public static boolean is_Sorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return is_Sorted(arr, i+1);
        
    }
    public static void main(String[] args) {
        int arr[] ={1,2,543,4,5};
        System.out.println(is_Sorted(arr, 0));
    }
    
}
