package top.daoyang.easy;

public class ConvertBST {
    public TreeNode convertBST(TreeNode root) {
        preOrder(root);
        return root;
    }
    
    private int t;
    private void preOrder(TreeNode root) {
        if (root == null) return;
        
        preOrder(root.right);
        root.val += t;
        t = root.val;
        preOrder(root.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(13);

        new ConvertBST().convertBST(root);
        System.out.println(root);
    }
}
