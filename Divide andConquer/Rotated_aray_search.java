public class Rotated_aray_search {


    public static int rotatedSearch(int arr[], int tar, int si, int ei){
        if(si>ei){
            return -1;
        }
       int mid = si+ (ei-si)/2; // (ei+si)/2
        if(arr[mid] == tar){
            return mid;
        }

        // check L1
        if(arr[si]<=arr[mid]){
            if(arr[si]<=tar && tar <=arr[mid]){ // left side
                return rotatedSearch(arr, tar, si, mid-1);
            }
            else{  // right side
              return  rotatedSearch(arr, tar, mid+1, ei);
            }
        }

        // check L2
        else{
              
                if(arr[mid]<=tar && tar<= arr[ei]){    // right side
                    return rotatedSearch(arr, tar, mid+1, ei);
                }
                else{ // left side
                   return rotatedSearch(arr, tar, si, mid-1);
                }
               
        }
       

    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
     int tar =1;
       int tarIdx = rotatedSearch(arr,tar,0,arr.length-1);
        System.out.println(tarIdx);
    }
}
