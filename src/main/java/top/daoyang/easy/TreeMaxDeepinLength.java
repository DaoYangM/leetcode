package top.daoyang.easy;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class TreeMaxDeepinLength {
    private TreeNode root;
    private int maxDeepin = 0;

    public int maxDepth(TreeNode root) {
        this.root = root;
        preOrderTraversal(root, 0);
        System.out.println(maxDeepin);
        return maxDeepin;
    }

    private void preOrderTraversal(TreeNode node, int deepin) {
        if (node != null) {
            if (node == root)
                deepin = 1;
            else deepin++;
            preOrderTraversal(node.left, deepin);
            preOrderTraversal(node.right, deepin);
        }

        if (this.maxDeepin < deepin) this.maxDeepin = deepin;
    }

    public static void main(String[] args) {
        TreeMaxDeepinLength treeMaxDeepinLength = new TreeMaxDeepinLength();
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(5);
        treeNode.left.right.left = new TreeNode(6);
        treeNode.left.left = new TreeNode(4);
        treeNode.right = new TreeNode(3);

        treeMaxDeepinLength.maxDepth(treeNode);
    }
}