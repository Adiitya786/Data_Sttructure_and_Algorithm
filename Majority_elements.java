public class Majority_elements {

    public static int major(int arr[]){
          for(int i =0;i<arr.length;i++){
            int count=1;
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count+=1;
                }
            }
            if(count >=arr.length/2){
                return arr[i];
            }
          }
          return -1;
    }
    

    public static void main(String[] args) {
        int arr[] = {2,3,2};
        System.out.println(major(arr));
    }
}
