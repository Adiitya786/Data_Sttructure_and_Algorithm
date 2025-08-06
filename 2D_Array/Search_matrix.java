public class Search_matrix {

    public static boolean Search_sorted_matrix(int mat[][],int key){

        // staircase approch


        // starting search from bottom left corner (n-1,0).

          int col =0;
          int row = mat.length-1;
          while(row>=0 && col<mat[0].length){
             if(mat[row][col]==key){
                 System.out.println("("+row+","+col+")");
                 return true;
            }
                else if(key> mat[row][col]){
                    col++;
                }
                else{
                    row--;
                }
          }
          System.out.println("key not found!...");
          return false;



        // starting search from top right corner(0,m-1).

        // int row =0;
        // int col= mat[0].length-1;
        // while(row<mat.length && col>=0){
        //     if(mat[row][col]==key){
        //          System.out.println("("+row+","+col+")");
        //          return true;
        //     }
        //     else if(key>mat[row][col]){
        //         row++;
        //     }
        //     else{
        //         col--;
        //     }
        // }
        // System.out.println("key not found!...");
        // return false;
    }
    public static void main(String[] args) {
        // sorted matrix..
        int mat[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key =39;
        Search_sorted_matrix(mat, key);
    }
}
