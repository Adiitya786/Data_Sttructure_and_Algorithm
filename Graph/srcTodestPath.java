import java.util.ArrayList;
import java.util.List;

public class srcTodestPath {
    public static void answer(List<List<Integer>> adj,int src,int dest,List<List<Integer>> ans,List<Integer> ds){
        if(src == dest){
            ds.add(dest);
            ans.add(new ArrayList<>(ds));
               ds.remove(ds.size()-1);
               return;
        }
        ds.add(src);
        for(int neigh : adj.get(src)){
            answer(adj,neigh,dest,ans,ds);
        }
        ds.remove(ds.size()-1);
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> adj = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        List<List<Integer>> ans  = new ArrayList<>();
        for(int i =0;i<graph.length;i++){
        adj.add(new ArrayList<>());
        for(int e :graph[i]){
             adj.get(i).add(e);
        }
        }
         answer(adj,0,graph.length-1,ans,ds);
         return ans;
    }

}
