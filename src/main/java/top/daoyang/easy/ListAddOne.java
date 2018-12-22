package top.daoyang.easy;

import java.util.Arrays;

public class ListAddOne {

    public static void main(String[] args) {
        ListAddOne listAddOne = new ListAddOne();
        System.out.println(Arrays.toString(listAddOne.plusOne(new int[]{9, 9})));
    }

    public int[] plusOne(int[] digits) {
        boolean needCarry = false;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
                if (!needCarry) {
                    needCarry = true;
                }
            } else {
                digits[i] = digits[i] + 1;
                return digits;
            }
        }

        int[] newDigits = new int[digits.length + 1];
        if (needCarry) {
            for (int i = 0; i < digits.length + 1; i++) {
                if (i == 0)
                    newDigits[i] = 1;
                else
                    newDigits[i] = 0;
            }
        }

        return newDigits;
    }
}
