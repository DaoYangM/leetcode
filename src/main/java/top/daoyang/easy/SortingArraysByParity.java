package top.daoyang.easy;

import java.util.Arrays;

public class SortingArraysByParity {
    public int[] sortArrayByParity(int[] A) {
        int index = 0;
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                res[index] = A[i];
                index ++;
            }
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 0) {
                res[index] = A[i];
                index ++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        SortingArraysByParity sortingArraysByParity = new SortingArraysByParity();
        System.out.println(Arrays.toString(sortingArraysByParity.sortArrayByParity(new int[]{1, 2, 3, 4})));
    }
}
