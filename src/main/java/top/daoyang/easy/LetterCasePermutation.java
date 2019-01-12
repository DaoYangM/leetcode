package top.daoyang.easy;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    public List<String> letterCasePermutation(String S) {
        List<String> res = new ArrayList<>();
        res.add("");

        char[] chars = S.toCharArray();
        for (char c : chars) {
            int len = res.size();

            if (Character.isDigit(c))
                for (int i = 0; i < res.size(); i++) {
                    res.set(i, res.get(i) + c);
                }
            else {
                for (int i = 0; i < len; i++) {
                    res.add(res.get(i));
                    res.set(i, res.get(i) + Character.toLowerCase(c));
                    res.set(len + i, res.get(len + i) + Character.toUpperCase(c));
                }
            }
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        LetterCasePermutation letterCasePermutation = new LetterCasePermutation();
        letterCasePermutation.letterCasePermutation("a1b2c3");
    }
}
