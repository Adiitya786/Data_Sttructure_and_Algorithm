import java.util.Arrays;
import java.util.Comparator;

public class MAx_pairs {
    
     public static int findLongestChain(int[][] pairs) {
        
        int max=1;
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int last = pairs[0][1];
        for(int i =1;i<pairs.length;i++){
            int start = pairs[i][0];
            if(pairs[i][0]> last){
                max++;
                last = pairs[i][1];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int pairs[][] = {{1,2},{3,4},{2,3}};
        int chain = findLongestChain( pairs);
        System.out.println("maximum lenght of chain is: "+chain);
    }
}
