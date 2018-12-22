package top.daoyang.easy;

public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(121));
    }

    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        if (x == 0) {
            return true;
        }

        int res = 0;
        int s2 = x;

        while(x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }

        if (s2 != res) {
            return false;
        }
        return true;
    }
}
