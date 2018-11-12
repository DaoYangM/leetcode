package top.daoyang.easy;

import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public class NNodeTree {
    public int maxDepth(Node root) {
        if (root == null) return 0;
        
        int j = 0;
        if (root.children != null) {
            for (Node node: root.children) {
                int x = maxDepth(node);
                if (x > j)
                    j = x;
            }            
        }

        return ++j;
    }

    public static void main(String[] args) {
        Node root = new Node(1,  new ArrayList<>());

        Node node1 = new Node(2, null);
        Node node2 = new Node(3, null);
        List<Node> list = new ArrayList<>();
        list.add(new Node(4, null));

        node2.children = list;

        root.children.add(node1);
        root.children.add(node2);

        NNodeTree nNodeTree = new NNodeTree();
        System.out.println(nNodeTree.maxDepth(root));
    }
}