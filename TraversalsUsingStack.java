package TreesPW;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class TraversalsUsingStack {
    private static void preOrderTraversal(Node root){
        Stack<Node> st = new Stack<>();
        st.add(root);
        System.out.println("Inorder Traversal:");
        while(!st.isEmpty()){
            Node temp = st.pop();
            System.out.print(temp.val+" ");
            if(temp.right!=null) st.add(temp.right);
            if(temp.left!=null) st.add(temp.left);
        }
        System.out.println();
    }
    private static void postOrderTraversal(Node root){
        Stack<Node> st = new Stack<>();
        st.add(root);
        System.out.println("postOrder Traversal:");
        ArrayList<Integer> arr = new ArrayList<>();
        while(!st.isEmpty()){
            Node temp = st.pop();
            arr.add(temp.val);
            if(temp.left!=null) st.add(temp.left);
            if(temp.right!=null) st.add(temp.right);

        }
        Collections.reverse(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    private static void inOrderTraversal(Node root) {
        Stack<Node> st = new Stack<>();
        Node temp = root;
        System.out.println("InOrder Traversal:");
        while (true) {
            if (temp != null) {
                st.add(temp);
                temp = temp.left;
            } else {
                if (temp == null && st.size() == 0) break;
                Node top = st.pop();
                System.out.print(top.val+" ");
                temp = top.right;
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node i = new Node(8);
        Node h = new Node(9);
        a.left =b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;
        f.right =h;e.left=i;
        preOrderTraversal(a);
        postOrderTraversal(a);
        inOrderTraversal(a);
    }
}
