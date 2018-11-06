package top.daoyang.easy;

import java.util.Arrays;

public class ReversalImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length / 2; j++) {
                int t = A[i][j];
                A[i][j] = A[i][A[i].length - 1 - j];
                A[i][A[i].length - 1 - j] = t;
            }
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] == 0) A[i][j] = 1;
                else A[i][j] = 0;
            }
        }

        return A;
    }

    public static void main(String[] args) {
        ReversalImage reversalImage = new ReversalImage();
        int[][] arr = {{1,1,0},{1,0,0},{0,1,1},{1,0,1}};
        System.out.println(Arrays.deepToString(reversalImage.flipAndInvertImage(arr)));
    }
}
