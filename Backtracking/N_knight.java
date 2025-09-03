import java.util.Scanner;

public class N_knight {

     public static boolean  IsSafe(char board[][], int row , int col){
           // left up diagonally
           for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'K'){
                 return false;
            }
           }

           // right up diagonally
           for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j] == 'K'){
                 return false;
            }
           }
           return true;
     }

    public static void  printBoard(char board[][]){
        System.out.println("--------chess board-------");
         for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
              System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    

    public static void possibleKnight(char board[][], int row){
              // basse case
              if(row == board.length){
                printBoard(board);
                return;
              }
              for(int col =0;col<board.length;col++){
                if(IsSafe(board,row,col)){
                    board[row][col] = 'K';
                    possibleKnight(board, row+1);  // recursion
                    board[row][col] = '*';

                }
              }
    }
    public static void main(String[] args) {
       System.out.println("choose the value for n*n chessboard: ");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

        char board[][] = new char[n][n];
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j] = '*';
            }
        }
        possibleKnight(board,0);
        sc.close();
    }
}
