import java.util.Scanner;

public class input_output2D {


    // to search for a particular element in a 2D array
    public static boolean Search_key(int matrix[][],int key){
             for(int i =0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
               System.out.println("item "+key+ " found at index: "+i+","+j );
               return true;
                }
           }
        }
        return false;
    }

  //    to find largest and smallest element in a 2D array.
    public static void compare(int matrix[][]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
         for(int i =0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
              max =Math.max(max,matrix[i][j]);
              min =Math.min(min,matrix[i][j]);
           
           }           
        }
        System.out.println("Largest element in 2-d array is: "+max);
        System.out.println("Smallest element in 2-d array is: "+min);
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        //input
        for(int i =0;i<n;i++){
           for(int j=0;j<m;j++){
               System.out.print("enter element "+i+","+j+": ");
            matrix[i][j] = sc.nextInt();
           }
        }
         // output
         for(int i =0;i<n;i++){
           for(int j=0;j<m;j++){
               System.out.print( matrix[i][j]+" ");
           
           }
           System.out.println();
           
        }
        Search_key(matrix, 8);
        compare(matrix);
        sc.close();
    }



}
