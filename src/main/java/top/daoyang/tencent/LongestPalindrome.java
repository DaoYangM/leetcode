package top.daoyang.tencent;

/**
 * LongestPalindrome
 */
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        // startIndex, size
        int startIndex = 0, size = 0;
        if (s.trim().equals(""))
            return "";
        for (int i = 0; i < s.length() - 1; i++) {
            String ss = String.valueOf(s.charAt(i));
            for (int k = s.length() - 1; k > i; k--) {
                if (String.valueOf(s.charAt(k)).equals(ss)) {
                    boolean flag = true;
                    int d = (k - i) / 2;
                    for (int j = 0, u = 0; j <= d; j++, u++) {
                        if (s.charAt(j+i) != s.charAt(k-u)) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        if (size <= k - i) {
                            startIndex = i;
                            size = k - i;
                            if (k == s.length() - 1) {
                                return s.substring(startIndex, startIndex + size + 1);
                            }
                        }
                    }                    
                }
            }
        }
        return s.substring(startIndex, startIndex + size + 1);
    }

    public static void main(String[] args) {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        System.out.println(longestPalindrome.longestPalindrome("caba"));
        // System.out.println(longestPalindrome.longestPalindrome("aaabaaaa"));
    }
}