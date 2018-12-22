package top.daoyang.easy;

public class Sqrt {
    public static void main(String[] args) {
        Sqrt sqrt = new Sqrt();
        System.out.println(sqrt.mySqrt(1));
    }

    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int mid = 0;

        if (x <= 1) return x;

        while (left < right) {
            mid = (left + right) / 2;
            if (mid * mid > x) right = mid;
            else if (mid * mid < x) left = mid + 1;
            else return mid;
        }

        return (left + right) / 2 - 1;
    }
}
