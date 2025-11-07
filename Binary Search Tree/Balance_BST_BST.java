import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

import org.w3c.dom.Node;

public class Balance_BST_BST {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data){
            this.data = data;
            TreeNode left = right = null;
        }

    }
    public static void preorder(TreeNode root){
        if(root ==  null) return ;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
      public static void getinorder(TreeNode root,List<Integer> arr ){
        if(root == null) return;
        getinorder(root.left,arr);
        arr.add(root.data);
        getinorder(root.right,arr);
    }

    public static TreeNode createBST(ArrayList<Integer> arr,int st, int end){
        if(st > end) return null;
        int mid = st+(end-st)/2;
        TreeNode root = new TreeNode(arr.get(mid));
        root.left = createBST(arr,st,mid-1);
        root.right = createBST(arr,mid+1,end);
        return root;
    }
    public static TreeNode Balanced(TreeNode root){
        // inorder sequence
        ArrayList<Integer> arr = new ArrayList<>();
        getinorder(root,arr);

        // sorted array-> balanced BST
        root = createBST(arr,0,arr.size()-1);
        return root;
    }
   public static void main(String[] args) {
    
   
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(6);
        root.left.left = new TreeNode(5);
        root.left.left.left = new TreeNode(3);

        root.right = new TreeNode(10);
        root.right.right = new TreeNode(11);
        root.right.right.right = new TreeNode(12);

        root = Balanced(root);
        preorder(root);
}
}