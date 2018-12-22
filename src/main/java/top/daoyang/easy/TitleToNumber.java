package top.daoyang.easy;

public class TitleToNumber {

    public int titleToNumber(String s) {
        char[] alpha = s.toCharArray();
        int res = 0;
        for(int i = alpha.length- 1, j = 0; i >= 0; i --, j ++) {
            
            res += ((int)alpha[i] - 64) * Math.pow(26, j);
        }
        return res;
    }

    public static void main(String[] args) {
        TitleToNumber titleToNumber = new TitleToNumber();
        System.out.println(titleToNumber.titleToNumber("AA"));
    }
}