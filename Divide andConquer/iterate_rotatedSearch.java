public class iterate_rotatedSearch {

    public static int rotatedSearch(int arr[],int tar, int si ,int ei){
       while(si<=ei){
            int mid =( si+ei)/2;
            if(arr[mid] == tar){
                return mid;
            }

         // left side
            if(arr[si] <= arr[mid]){
                if(arr[si]<=tar &&  tar<=arr[mid]){
                    ei = mid-1;
                }
                else{
                    si = mid +1;
                }
        }
        //right side
        else{
            if(arr[mid]<=tar && tar<= arr[ei]){
                si = mid+1;
            }
            else{
                ei = mid-1;
            }

        }
      
       }
         return -1;
    }
        public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
     int tar =0;
       int tarIdx = rotatedSearch(arr,tar,0,arr.length-1);
        System.out.println(tarIdx);
}

}