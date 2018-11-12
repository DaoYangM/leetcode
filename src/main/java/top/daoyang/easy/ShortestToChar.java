package top.daoyang.easy;

import java.util.Arrays;

public class ShortestToChar {
    public int[] shortestToChar(String S, char C) {
        int[] res = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            int left = 0, right = 0, r = 0;
            for (int j = 0; j < S.length(); j++) {
                if (S.charAt(i) == C) {
                    r = 0;
                    break;
                }
                if (i - j - 1 >= 0) {
                    if (S.charAt(i - j - 1) == C) 
                        left = j + 1;
                }
                if (i + j + 1 < S.length()) {
                    if (S.charAt(i + j + 1) == C) 
                        right = j + 1;
                }

                if (left == 0 && right != 0) {
                    r = right;
                    break;
                }
                else if (right == 0 && left != 0) {
                    r = left;
                    break;
                } else if (left != 0 && right != 0 && left == right) {
                    r = left;
                    break;
                }
                    
            }
            res[i] = r;
        }
        return res;
    }

    public static void main(String[] args) {
        ShortestToChar shortestToChar = new ShortestToChar();
        System.out.println(Arrays.toString(shortestToChar.shortestToChar("loveleetcode", 'e')));
    }
}