public class Diagonal_sum {
    public static int Sum_diagonal(int mat[][]){
        int sum=0;

        // Time complexity =O(n^2)
        // for( int i =0;i<mat.length;i++){
        //     for(int j=0;j<mat[0].length;j++){
        //         if(i==j){
        //             sum+=mat[i][j];
        //         }
        //         else if(i+j==mat.length-1){
        //             sum+=mat[i][j];
        //         }
        //     }
        // }
        // return sum;


       for(int i=0;i<mat.length;i++){
           // for primary diagonal
            sum+= mat[i][i];
           
            // for secondary diagonal
            if(i!=mat.length-i-1){
                sum += mat[i][mat.length-i-1];
            }

       }
        return sum;

    }
    public static void main(String[] args) {
        // for square (n*n) matrix.
         int mat[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
         System.out.println(Sum_diagonal(mat));
    }
}
