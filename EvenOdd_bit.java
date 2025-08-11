public class EvenOdd_bit {
    public static void Odd_even(int n){
        int bitMask =1;
        if((n & bitMask)==0){
            System.out.println("even number...");
        }
        else{
             System.out.println("odd number...");
        }
    }
    public static void main(String[] args) {
        Odd_even(447);
    }
}
