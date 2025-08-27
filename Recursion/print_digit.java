public class print_digit {
    static String digit[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void printDigit(int n){
        if(n== 0){
            return;
        }
        int rem = n%10;
        printDigit(n/10);
        System.out.print(digit[rem]+" ");

    }
    public static void main(String[] args) {
        printDigit(12340);
    }
}
