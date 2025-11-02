import java.nio.file.Path;
import java.util.*;

public class Lowest_common_anc {
    
static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left=null;
            this.right = null;
        }
    }

    public static boolean getpath(Node root, int n,ArrayList <Integer> path ){
        if(root == null)  return false;
  
        path.add(root.data);
        if(root.data == n) return true;
        boolean left_found = getpath(root.left, n, path);
         boolean right_found = getpath(root.right, n, path);
        
         if(left_found || right_found)  return true;
         path.remove(path.size()-1);
         return false;
        }

    public static Node lca(Node root, int n1,int n2){
        ArrayList<Integer> path1 = new ArrayList<>();
        ArrayList <Integer> path2 = new ArrayList<>();

        getpath(root,n1,path1);
        getpath(root,n2,path2);

        int i =0;
        for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i) != path2.get(i)){
                   break;
            }
        }
        int lca = path1.get(i-1);
        return new Node(lca);
   
    }

    public static Node lca2(Node root, int n1, int n2){
        if(root == null || root.data ==  n1 || root.data == n2) return root;

        Node leftlca = lca2(root.left, n1, n2);
        Node rightlca = lca2(root.right, n1, n2);

        if(leftlca ==null) return rightlca;
        if(rightlca ==null) return leftlca;

        return root;
    }
     public static void main(String[] args) {
         Node root = new Node(1);
     root.left = new Node(2);
     root.right = new Node(3);
     root.left.left = new Node(4);
     root.left.right = new Node(6);
     root.right.left = new Node(5);
     root.right.right = new Node(7);
     root.left.left.left = new Node(9);
    

     int n1 =4,n2= 7;
     System.out.println("lowest common ancestor: "+ lca2(root, n1, n2).data);
    }
}
