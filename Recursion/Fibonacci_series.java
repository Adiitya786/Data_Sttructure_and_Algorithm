public class Fibonacci_series {
     public static void fiboo(int n,int a,int b){
        // if(n==1 || n==0){
        
        //     return;
        // }
        if(n==0){
            return;
        }
        System.out.print(a+" ");
        fiboo(n-1,b,a+b);

    }
    public static void main(String[] args) {
       fiboo(11,0,1);
}
}