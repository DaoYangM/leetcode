package top.daoyang.tencent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        if (nums.length == 0) return null;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) return res;
            int target = 0 - nums[i];
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int L = i + 1, R = nums.length - 1;
            while (L < R) {
                if (nums[L] + nums[R] == target) {
                    List<Integer> item = new ArrayList<>();
                    item.add(nums[i]);item.add(nums[L]);item.add(nums[R]);
                    res.add(item);

                    while (L < R && nums[L] == nums[L + 1]) L++;
                    while (L < R && nums[R] == nums[R - 1]) R--;
                    L++;R--;
                } else if (nums[L] + nums[R] > target) R--;
                else L++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new ThreeSum().threeSum(new int[] {1,-1,-1,0}));
    }
}
