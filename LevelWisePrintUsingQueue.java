package TreesPW;

import java.util.LinkedList;
import java.util.Queue;

class Pair{
    Node node;
    int level;
    Pair(Node node,int level){
        this.node = node;
        this.level = level;
    }
}
public class LevelWisePrintUsingQueue {
    private static void BFS(Node root){
        Queue<Pair> que = new LinkedList<>();
        que.add(new Pair(root,0));
        int prelevel = 0;
        while(que.size()>0){
            Pair front = que.remove();
            Node temp = front.node;
            int lvl = front.level;
            if(prelevel != lvl){
                System.out.println();
                prelevel++;
            }
            System.out.print(temp.val);
            if(temp.left!=null) que.add(new Pair(temp.left,lvl+1));
            if(temp.right!=null) que.add(new Pair(temp.right,lvl+1));
        }
    }
    public static void main(String[] args) {
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
        f.left=g;e.right=i;
        BFS(a);
    }
}
