public class Spiral_matrix {
    public static void MAtrix_spiral_print(int mat[][]){
        int start_row=0;
        int start_col =0;
        int end_col =mat[0].length-1;
        int end_row=mat.length-1;
        while(start_row<=end_row && start_col<=end_col){
            //Top
            for(int j =start_col;j<=end_col;j++){
                if(start_col==end_col){
                    break;
                }
                System.out.print(mat[start_row][j]+" ");
            }
            // Right
            for( int i =start_row+1;i<=end_row;i++){
                if(start_row==end_row){
                    break; 
                }
                System.out.print(mat[i][end_col]+ " ");
            }
            // Bottom
            for(int j=end_col-1;j>=start_col;j--){
                System.out.print(mat[end_row][j]+" ");
            }
            // Left
            for(int i =end_row-1;i>=start_row+1;i--){
                System.out.print(mat[i][start_col]+" ");
            }
            start_row++;
            start_col++;
            end_col--;
            end_row--;
        }


    }
    public static void main(String[] args) {
        // valid for n*m matrix and n*n matrix both.
        int mat[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        MAtrix_spiral_print(mat);
    }
}
