

public class Min_distance {
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
  
    public static Node Lca(Node root,int n1,int n2){
        if(root== null || root.data ==n1 || root.data == n2) return root;
 
        Node leftlca = Lca(root.left,n1,n2);
        Node rightlca = Lca(root.right,n1,n2);
        
        if(rightlca == null) return leftlca;
        if(leftlca == null) return rightlca;

        return root;
    }


    public static int distance(Node root,int n){
        if(root == null) return -1;
        if(root.data == n) return 0;
        int leftdis = distance(root.left, n);
        int rightdis = distance(root.right, n);

        if(leftdis == -1 && rightdis==-1) return -1;
        else if(leftdis==-1) return rightdis+1;
        else return leftdis+1;


    }

    public static int mindis(Node root, int n1 ,int  n2){
        Node lca = Lca(root,n1,n2);
        int dis1 = distance(lca,n1);
        int dis2 = distance(lca,n1);

        return dis1+dis2;
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

     System.out.println("Minimum distance betweem Node n1 and n2: "+mindis(root, n1, n2));
}
}
