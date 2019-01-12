package top.daoyang.tencent;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length <=0) return "";
        StringBuilder res = new StringBuilder();
        boolean isBreak = false;
        int i = 0;
        int length = strs[0].length();
        while (!isBreak) {
            if (i < length) {
                String first = strs[0].substring(i, i + 1);
                boolean isSame = true;
                for (int i1 = 1; i1 < strs.length; i1++) {
                    String s = strs[i1];
                    if (!(i < s.length() && s.substring(i, i + 1).equals(first))) {
                        return res.toString();
                    }
                }
                res.append(first);
                i++;
            } else {
                return res.toString();
            }
        }
        System.out.println(res.toString());
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[] {""}));
    }
}
