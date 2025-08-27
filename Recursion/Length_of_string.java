public class Length_of_string {

        public static int str_length(String str,int i){
            if(i == str.length()){
                return i;
            }
          
            return str_length(str, i+1);
            

        }
    public static void main(String[] args) {
        String str = "Aditya Prajapati";
        System.out.println(str_length(str, 0));
    }
}
