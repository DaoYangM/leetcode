package top.daoyang.easy;

public class MaxSubListSum {
    public static void main(String[] args) {
        MaxSubListSum maxSubListSum = new MaxSubListSum();
        System.out.println(maxSubListSum.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
    }

    public int maxSubArray(int[] nums) {
        int res = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum > res) res = sum;
            }
        }

        return res;
    }
}
