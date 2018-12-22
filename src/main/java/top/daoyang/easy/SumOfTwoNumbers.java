package top.daoyang.easy;

import java.util.Arrays;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        SumOfTwoNumbers sumOfTwoNumbers = new SumOfTwoNumbers();
        System.out.println(Arrays.toString(sumOfTwoNumbers.twoSum(new int[]{0, 3, 2, 4, 0}, 0)));
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    return new int[]{ i, j };
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
