import java.util.*;
public class Merge_2_BST {
     static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            Node left = null;
            Node right = null;
        }
    }

    public static void getinorder( Node root,ArrayList<Integer> arr){
        if(root == null) return;
        getinorder(root.left,arr);
        arr.add(root.data);
        getinorder( root.right,arr);
    }
    public static void merge_sort( ArrayList<Integer> arr1, ArrayList<Integer> arr2, ArrayList<Integer> finalArr){
        int i =0, j=0;
        while(i<arr1.size() && j < arr2.size()){
            if(arr1.get(i) < arr2.get(j)){
                finalArr.add(arr1.get(i));
                i++;
            }
            else{
                      finalArr.add(arr2.get(j));
                      j++;
            }
        }
        while(i<arr1.size()){
             finalArr.add(arr1.get(i));
                i++;
        }

        while(j<arr2.size()){
              finalArr.add(arr2.get(j));
              j++; 
        }
    }

    public static Node createBST(ArrayList<Integer> finalArr, int st, int end){
        if(st > end) return null;
        int mid = st+(end-st)/2;
        Node root = new Node(finalArr.get(mid));
        root.left = createBST(finalArr, st, mid-1);
        root.right = createBST(finalArr, mid+1,end);

        return root;
    }
    public static Node mergeBST(Node root1, Node root2){
        // sort 1st bst by inorder sequence
        ArrayList<Integer> arr1 = new ArrayList<>();
        getinorder(root1,arr1);

        // sort 2nd bst by inorder sequence 
        ArrayList<Integer> arr2 = new ArrayList<>();
        getinorder(root2,arr2);

          ArrayList<Integer> finalArr = new ArrayList<>();
        //   merge_sort(arr1,arr2,finalArr);
           int i =0, j=0;
        while(i<arr1.size() && j < arr2.size()){
            if(arr1.get(i) < arr2.get(j)){
                finalArr.add(arr1.get(i));
                i++;
            }
            else{
                      finalArr.add(arr2.get(j));
                      j++;
            }
        }
        while(i<arr1.size()){
             finalArr.add(arr1.get(i));
                i++;
        }

        while(j<arr2.size()){
              finalArr.add(arr2.get(j));
              j++; 
        }

         return  createBST(finalArr,0,finalArr.size()-1);
    }

    public static void preorder(Node root ){
        if(root == null) return ;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBST(root1, root2);
        preorder(root);
    }
}
