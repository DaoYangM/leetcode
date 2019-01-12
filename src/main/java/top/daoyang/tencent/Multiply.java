package top.daoyang.tencent;

import java.util.Arrays;

public class Multiply {
    public String multiply(String num1, String num2) {
        int[] temp = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                temp[i + j] = temp[i + j] + (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }

        int carry = 0;
        int maxLength = num1.length() + num2.length() - 2;
        StringBuilder stringBuilder = new StringBuilder();
        boolean isAllZero = true;

        for (int i = maxLength; i >=0; i--) {
            temp[i] = temp[i] + carry;
            if (i != 0) {
                carry = temp[i] / 10;
                temp[i] = temp[i] % 10;

            }
            if (temp[i] != 0)
                isAllZero = false;
            stringBuilder.insert(0, temp[i]);
        }
        if (isAllZero)
            return "0";

        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Multiply multiply = new Multiply();
        multiply.multiply("98", "9");
    }
}
