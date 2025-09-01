public class find_substes {
    public static void Subsets(String str,int i,String ans){

        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }

        //recursive case
        Subsets(str, i+1, ans+ str.charAt(i)); //yes choice
        Subsets(str, i+1, ans); // no choice
    }
    public static void main(String[] args) {
        String str ="abc";
        Subsets(str, 0, "");

    }
}
