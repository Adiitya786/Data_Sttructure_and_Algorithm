public class Friends_pair {

    public static int pair_friends(int n){
        if(n==1|| n==2){
            return n;
        }
        // brute force

        // int falone = pair_friends(n-1);
        // int fpair = pair_friends(n-2);
        // int totways = falone + (n-1) * fpair;
        // return totways;


        // otimized
        return pair_friends(n-1) + (n-1) * pair_friends(n-2);
    }
    public static void main(String[] args) {
        System.out.println(pair_friends(4));
        
    }
}
