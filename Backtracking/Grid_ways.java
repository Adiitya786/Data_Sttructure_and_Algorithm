public class Grid_ways {

    public static int noWays(int grid[][], int i ,int j, int m,int n){
        // base case
        if(i==m-1 && j== n-1){
            return 1;
        }
        if(i==m || j== n){
            return 0;
        }
        //recursion
        int w1 = noWays(grid, i+1, j, m, n);
        int w2 = noWays(grid, i, j+1, m, n);
        return w1 + w2;
    }
    public static void main(String[] args) {
        int n=4,m=4;
        int grid[][] = new int[m][n];
        System.out.println(noWays(grid,0,0,m,n));
    }
    
}
