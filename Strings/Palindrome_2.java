public class Palindrome_2{
    public static void main(String[] args) {
       String str ="A man, a plan, a canal: Panama.";
       String cleaned = str.replaceAll("[^a-zA-Z0-9]","");
       String str1 = cleaned.toLowerCase();
       for(int i=0;i<str1.length()/2;i++){
        if(str1.charAt(i)!=str1.charAt(str1.length()-i-1)){
            System.out.println("Not Palindrome!...");
            
        }
       }
       System.out.println("Palindrome!....");
       
    }
}