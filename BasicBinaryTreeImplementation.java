package TreesPW;


import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}


public class BasicBinaryTreeImplementation {
    // to display the binary tree recursively
    public static void displayRecursively(Node root){
        if(root==null) return;
        System.out.print(root.val);
        displayRecursively(root.left);
        displayRecursively(root.right);
    }
    // to find sum of the nodes
    private static int findSum(Node root){
        if(root==null) return 0;
        return root.val+findSum(root.left)+findSum(root.right);
    }
    // to find product of tree nodes which are non zero
    private static int findProduct(Node root){
        if(root==null || root.val == 0) return 1;
        return root.val*findProduct(root.left)*findProduct(root.right);
    }
    //Maximum value in the tree
    private static int findMax(Node root){
        if(root == null) return Integer.MIN_VALUE;
        int leftmax = findMax(root.left);
        int rightmax = findMax(root.right);
        return Math.max(root.val,Math.max(leftmax,rightmax));
    }
    //Minimum value in the tree
    private static int findMin(Node root){
        if(root==null) return Integer.MAX_VALUE;
        int leftmin = findMin(root.left);
        int rightmin = findMin(root.right);
        return Math.min(root.val,Math.min(leftmin,rightmin));
    }
    //To find Size of the binary Tree
    private static int findSize(Node root){
        if(root==null) return 0;
        return 1+findSize(root.left)+findSize(root.right);
    }
    //Levels of the BinaryTree
    private static int findLevels(Node root){
        if(root==null) return 0;
        return 1+Math.max(findLevels(root.left),findLevels(root.right));
    }
    //display recursively preorder,inorder,postorder
    private static void preOrderRecursively(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preOrderRecursively(root.left);
        preOrderRecursively(root.right);
    }
    private static void inOrderRecursively(Node root){
        if(root==null){
            return;
        }
        inOrderRecursively(root.left);
        System.out.print(root.val+" ");
        inOrderRecursively(root.right);
    }
    private static void postOrderRecursively(Node root){
        if(root==null) {
            return;
        }
        postOrderRecursively(root.left);
        postOrderRecursively(root.right);
        System.out.print(root.val+" ");
    }
    private static void invertBinaryTree(Node root){
        if(root==null) return;
        invertBinaryTree(root.left);
        invertBinaryTree(root.right);
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
    private static void BFS(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root!= null) q.add(root);
        while(q.size()>0){
            Node x = q.remove();
            if(x.left!=null)q.add(x.left);
            if(x.right!= null) q.add(x.right);
            System.out.print(x.val);
        }
        System.out.println();
    }
    private static void NthLevel(Node root,int lvl,int level){
        if(root==null) return;
        if(lvl== level){
            System.out.print(root.val);
        }
        if(level>lvl) return;
        NthLevel(root.left,lvl,level+1);
        NthLevel(root.right,lvl,level+1);
    }

    public static void main(String[] args){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(7);
        Node g = new Node(9);
        Node h = new Node(6);
        Node i = new Node(8);
        a.left =b;a.right=c;
        b.left=d;b.right=e;
        c.left=h;c.right=f;
        h.right =g;e.left=i;
//        displayRecursively(a);

//        System.out.println(findSum(a));
//        System.out.println(findProduct(a));
//        System.out.println(findMax(a));
//        System.out.println(findMin(a));
//        System.out.println(findSize(a));
//        System.out.println(findLevels(a));
//        preOrderRecursively(a);
//        System.out.println("preOrder display");
//        inOrderRecursively(a);
//        System.out.println("InOrder display");
//        postOrderRecursively(a);
//        System.out.println("PostOrder display");
//        invertBinaryTree(a);
//        displayRecursively(a);

        //to print nodes level wise in a single line.
//        BFS(a);

        //To print nodes of a particular level
//          NthLevel(a,2,0);

        //To print nodes level wise
//        int n = findLevels(a);
//        for(int y=0;y<n;y++){
//            NthLevel(a,y,0);
//            System.out.println();
//        }





    }
}
