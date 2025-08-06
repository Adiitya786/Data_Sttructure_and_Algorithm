public class Transpose_matrix {
    public static void transpose_Of_matrices(int mat[][]){
        // transpose of a matrix is the process of swapping rows to column or vice-versa.
        for(int i=0;i<mat[0].length;i++){
            for(int j=0;j<mat.length;j++){
                System.out.print(mat[j][i]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};  
        transpose_Of_matrices(mat);
    }
}
