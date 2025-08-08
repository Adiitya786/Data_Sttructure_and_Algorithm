public class Shortest_path {
    public static float gets_short_path( String path){
        int x =0,y=0;
        for(int i=0;i< path.length();i++){
            char dirc = path.charAt(i);
             if(dirc =='N'){
                y++;
             }
             else if(dirc =='S'){
                y--;
             }
             else if(dirc =='E'){
                x++;
             }
             else{
                x--;
             }
           

        }
         int X2 =x*x;
         int Y2= y*y;
          return (float)Math.sqrt(Y2+X2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(gets_short_path(path));

    }
}
