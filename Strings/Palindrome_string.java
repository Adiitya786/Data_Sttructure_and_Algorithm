import java.util.Scanner;

public class Palindrome_string {
    public static boolean Palindrome(String str){
        
        // int first =0,last =str.length();
        // while(first<=last){
        //     int te
        // }

        for(int i=0;i<str.length()/2;i++){    // run loop half times and compare both side.
            
             if(str.charAt(i)!=str.charAt(str.length()-i-1)){    // comparison
                 System.out.println("not a palindrome!...");
                 return false;
             }
        }
        System.out.println("string is palindrome....");
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check palindrome or not: ");
        String str = sc.nextLine();
        Palindrome(str);
        sc.close();
    }
}
