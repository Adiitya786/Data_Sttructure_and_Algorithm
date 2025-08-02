public class Trapping_Rainwater {
    public static void trapped_water(int height[]){
        int n = height.length;
        int left_max[] = new int[n];
        int right_max[] = new int[n];
        left_max[0]=height[0];
        right_max[n-1]=height[n-1];
        // calculate left max boundary
        for(int i= 1;i<n;i++){
            left_max[i]=Math.max(height[i],left_max[i-1]);
        }
        // claculate right max boundary
         for( int i=n-2;i>=0;i--){
            right_max[i]=Math.max(height[i], right_max[i+1]);
         }
        // calculate water level by finding minimum of right max and left max boundary.
        int trap_water=0;
        for(int i=0;i<n;i++){
          int water_level = Math.min(right_max[i],left_max[i]);
          trap_water+=(water_level-height[i]);

        }
        //trapped water = (water level -height) *width   {normally width is 1.}
         System.out.println("Trapped rainwater in the the building bars is: "+trap_water);
    }
 
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        trapped_water(height);
    }
}
