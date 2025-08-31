public class String_sort {
   

    public static void printArray(String str[]){
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]+" ");
        }
    }


    public static void merge(String str[],int si, int mid, int ei){
        int i=si; // index for left merge
        int j=mid+1;// index for right merge
        int k=0;    // for temp indexing
        String temp[] = new String[ei-si+1];
        while (i<=mid && j<=ei) {

            if(str[i].compareTo(str[j])<0){
                temp[k] = str[i];
                i++;
            }
            else{
                temp[k] = str[j];
                j++;
            }
            k++;
                
            }
            // for leftover elements in left array
            while(i<=mid){
                temp[k++] = str[i++];
            }
            while(j<=ei){
                temp[k++] = str[j++];
            }
             for(k=0, i=si;k<temp.length;k++,i++){
            str[i] = temp[k];
        }

    }
    public static void mergesort(String str[], int si, int ei){
        // Base case
        if(si>= ei){
            return;
        }
        //kaam
        int mid = si + (ei-si)/2;
        mergesort(str, si, mid); //left sort
        mergesort(str, mid+1, ei);
        merge(str,si,mid,ei);
    }
    public static void main(String[] args) {
        String str[] = {"earth","sun","mars","mercury","apple","banana","zebra"};
        mergesort(str, 0, str.length-1);
        printArray(str);

    }

}
