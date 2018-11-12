package top.daoyang.easy;

import java.util.Arrays;

public class NumberOfLines {
    public int[] numberOfLines(int[] widths, String S) {        
        int row = 1, lastCount = 0;
        for (int i = 0; i < S.length(); i++) {
            int l = S.charAt(i) - 97;
            if (lastCount + widths[l] > 100) {
                row ++;
                lastCount = widths[l];
            } else {
                lastCount += widths[l];
            }
        }

        return new int[]{row, lastCount};
    }

    public static void main(String[] args) {
        int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        System.out.println(Arrays.toString(new NumberOfLines().numberOfLines(widths, "abcdefghijklmnopqrstuvwxyz")));
    }
}