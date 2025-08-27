public class find_key{
    public static void elements_find(int arr[], int i,int key){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.println(i+" ");
        }
        elements_find(arr, i+1, key);
    }
    public static void main(String[] args) {
       int arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2;
       elements_find(arr, 0, key);
    }
}