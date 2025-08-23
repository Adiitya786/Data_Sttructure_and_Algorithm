public class optimized_power {
       
    public static int optimisedPower(int x,int n){
          if(n==0){
            return 1;
          }

          int halfPower = optimisedPower(x, n/2);
          int halfPowersq = halfPower *halfPower;

          if(n%2 != 0){
            halfPowersq = x * halfPowersq;
          }
           return halfPowersq;
    }

    public static void main(String[] args) {
        System.out.println(optimisedPower(2, 5));
    }
}
