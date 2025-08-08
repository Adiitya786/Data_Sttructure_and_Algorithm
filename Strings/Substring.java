public class Substring {

    // This method manually gives the  substring.
    public static String Subs_string(String str,int si, int ei){
        String subs ="";
        for(int i=si;i<ei;i++){
             subs += str.charAt(i);
        }
        return subs;
    }
    public static void main(String[] args) {
        String str = "Aditya Prajapati";
        System.out.println(Subs_string(str, 0, 6)); //  0:staring index  and 6: ending index excluding it.
        // System.out.println(str.substring(0,6));  // Function 'substring' can automaticallly give the particular part of string.
    }
}
