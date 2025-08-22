public class DEc_order{

    public static void print_dec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        print_dec(n-1);
    }

    public static void print_inc(int n){
        if(n==0){
            return;
        }
       print_inc(n-1);
       System.out.print(n+" "); 
        
    }
    public static void main(String[] args) {
        print_dec(10);
        System.out.println();
        print_inc(10);
    }
}