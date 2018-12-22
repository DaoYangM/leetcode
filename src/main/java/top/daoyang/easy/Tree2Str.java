package top.daoyang.easy;

public class Tree2Str {
    private StringBuilder res = new StringBuilder();

    private String tree2str(TreeNode t) {
        tree(t);

        return res.toString();
    }

    private void tree(TreeNode t) {
        if (t == null) return;

        res.append(t.val);
        if (t.left != null) {
            res.append("(");
            tree2str(t.left);
            res.append(")");
        } else if (t.right != null) {
            res.append("()");
        }

        if (t.right != null) {
            res.append("(");
            tree2str(t.right);
            res.append(")");
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left =  new TreeNode(2);
        treeNode.right =  new TreeNode(3);

//        treeNode.left.left = null;
        treeNode.left.left = new TreeNode(4);

        Tree2Str tree2Str = new Tree2Str();
        tree2Str.tree2str(treeNode);
        System.out.println(tree2Str.res);
    }
}
