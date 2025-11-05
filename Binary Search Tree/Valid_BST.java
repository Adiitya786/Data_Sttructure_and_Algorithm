
public class Valid_BST {
      static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static Node insert(Node root, int val){
        if(root ==null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
       return root;
    }

    public static boolean IsValidBST(Node root, Node min, Node max){
        if(root == null) return true;
        if(min!= null && root.data <= min.data) return false;
        else if(max != null && root.data >= max.data) return false;

        return IsValidBST(root.left,min,root) && IsValidBST(root.right, root, max);
    }
    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i =0;i<values.length;i++){
            root = insert(root, values[i]);
        }
        if(IsValidBST(root, null, null)) System.out.println("Valid BST");
        else System.out.println("Not a valid BST");
}
}