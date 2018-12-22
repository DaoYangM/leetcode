package top.daoyang.easy;

import java.util.ArrayList;
import java.util.List;

class BinaryTreePaths {
    private List<String> list = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        t(root, "");
        return list;
    }
    
    private void t(TreeNode root, String res) {
        if (root == null) return;

        if (root.left==null && root.right==null) {
            res += Integer.toString(root.val);
            list.add(res);
            return;
        }
        res += Integer.toString(root.val) + "=>";
        t(root.left, res);
        t(root.right, res);
    }
}