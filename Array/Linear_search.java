
import java.util.*;


public class Linear_search {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean found = false;
        System.out.println("enter the number of elements in an array: ");
        int n = sc.nextInt();
        int num[]= new int[n];
        System.out.println("enter the "+n+" elements: ");
        for(int i=0;i<num.length;i++){
            // inputing elements
            System.out.println("element "+(i+1)+": ");
            num[i]=sc.nextInt();
        }
        System.out.println("enter the searching element: ");
        int item = sc.nextInt();
        for(int i=0;i<num.length;i++){
            if(num[i]==item){
            System.out.println("element found at position: "+(i+1));
            found=true;
            break;
            }
        }
        if(!found){
            System.out.println("seaching element does not lies in the array.");
        }
        sc.close();













    // Trying it with string variables .....

   /*       public static int linear_search(String str[],String item){
    for(int i =0;i<5;i++){
      if(str[i]==item){
        
        return i+1;
        
      }
           
    }
    return -1;

  }
  public static void main(String[] args) {
    
      String menu[]= new String[5];
      menu[0] = "veg soup";
      menu[1] = "non-veg soup";
      menu[2] = "chinese noodles";
      menu[3] = "japnese manchurian";
      menu[4] = "dosa";
      String item = "veg soup";
     int index = linear_search(menu, item);
      if(index ==-1){
        System.out.println("food is  not in the menu...");
      }
      else{
        System.out.println(menu[index-1]+" is in  in the menu at page: "+index);
      }
      */
    }
    
}
