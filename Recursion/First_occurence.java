public class First_occurence {

    public static int occur(int arr[], int i,int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return occur(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5};
        System.out.println(occur(arr, 0, 4));
    }
}
