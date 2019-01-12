package top.daoyang.tencent;

public class MaxArea {
    public int maxArea(int[] height) {
        int res = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int minHeight = Math.min(height[i], height[j]);

                res = Math.max(res, minHeight * (Math.abs(i - j)));
            }
        }

        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        MaxArea maxArea = new MaxArea();
        maxArea.maxArea(new int[] {1,8,6,2,5,4,8,3,7});
    }
}
