package top.daoyang.easy;

import java.util.HashSet;
import java.util.LinkedList;

class TreeNode2 {
    int val;
    TreeNode2 left;
    TreeNode2 right;

    TreeNode2(int x) {
        val = x;
    }
}

public class SortedArrayToBST {
    public TreeNode2 sortedArrayToBST(int[] nums) {
        if (nums.length == 0)
            return null;
        int mid = nums.length / 2;
        TreeNode2 root = new TreeNode2(nums[mid]);
        int[] l = new int[mid - 0];
        int[] r = new int[nums.length - 1 - mid];
        for (int i = 0; i < l.length; i++)
            l[i] = nums[i];
        for (int j = mid + 1; j < nums.length; j++)
            r[j - mid - 1] = nums[j];

        root.left = sortedArrayToBST(l);
        root.right = sortedArrayToBST(r);

        return root;
    }

    public static void main(String[] args) {
        new SortedArrayToBST().sortedArrayToBST(new int[]{1, 2, 3});
        LinkedList linkedList = new LinkedList<>();
        linkedList.isEmpty();
    }
}