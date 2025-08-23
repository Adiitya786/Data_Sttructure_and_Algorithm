public class Factorial {

    public static int print_fibo(int n){
        
        if(n==1 || n==0){  // Base case
            return 1;
        }
       
       int fib=  print_fibo(n-1);
       
        int fiboo=  n * fib;   //  Recursive case
       
       return fiboo;
    }
    public static void main(String[] args) {
       
        System.out.println( print_fibo(6));
    }
}
