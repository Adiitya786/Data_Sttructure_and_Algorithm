public class Fibonacci_no {
    public static int fib(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        int fib_prev = fib(n-1);
        int fib_prevTwo = fib(n-2);
        return fib_prev+fib_prevTwo;

    }
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
