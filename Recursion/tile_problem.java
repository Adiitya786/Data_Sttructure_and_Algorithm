public class tile_problem {

    public static int tile(int n){
        // base case
        if(n==0 ||n==1){
            return 1;
        }
        // vertical tile
        int fnm1 = tile(n-1);
        // horizontal tile
        int fnm2 = tile(n-2);
        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(tile(5));
    }
    
}
