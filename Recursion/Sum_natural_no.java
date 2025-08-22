public class Sum_natural_no {

    public static int natural_sum(int n){
        int n_sum =0;
        if(n==1){
            return 1;
        }
        int sum = natural_sum(n-1);
        n_sum = n + sum;
        return n_sum;

    }
    public static void main(String[] args) {
        System.out.println(natural_sum(7));
    }
}
