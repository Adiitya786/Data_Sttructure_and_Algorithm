public class input_output_S{

    public static void print_string(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+ " ");   // Printing string 
        }System.out.println();
    }
    public static void main(String[] args) {
        
        String firstName = "Aditya ";
        String lastName = "Prajapati ";
        String fullName = firstName+" "+ lastName;   // concatenation 
        System.out.println(fullName);
        System.out.println(fullName.charAt(0));  // using of charAt() method to print a particular index.
        print_string(fullName);
       
    }
}