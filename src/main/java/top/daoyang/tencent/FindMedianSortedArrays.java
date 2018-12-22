package top.daoyang.tencent;

import java.util.Arrays;

public class FindMedianSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] t;
        if (nums1.length == 0)
            t = nums2;
        else if (nums2.length == 0)
            t = nums1;
        else {
            t = new int[nums1.length + nums2.length];
            System.arraycopy(nums1, 0, t, 0, nums1.length);
            System.arraycopy(nums2, 0, t, nums1.length, nums2.length);
        }
        Arrays.sort(t);

        int mid = t.length / 2;

        if (t.length % 2 == 0) {
            return ((double)(t[mid] + t[mid - 1])) / 2;
        } else
            return t[mid];
    }

    public static void main(String[] args) {
        new FindMedianSortedArrays().findMedianSortedArrays(new int[]{}, new int[]{1});
    }
}
