package top.daoyang.easy;

public class CommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String res = "";
        String str1 = strs[0];
        for (int i = 0; i < str1.length(); i++) {
            String c = str1.substring(i, i + 1);
            boolean isAllSame = true;
            for (int j = 1; j < strs.length; j++) {
                try {
                    if (!strs[j].substring(i, i + 1).equals(c)) {
                        isAllSame = false;
                    }
                } catch (StringIndexOutOfBoundsException ex) {
                    return res;
                }
            }
            if (isAllSame) {
                res += c;
            } else {
                return res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        CommonPrefix commonPrefix = new CommonPrefix();
        System.out.println(commonPrefix.longestCommonPrefix(new String[]{"aca","cba"}));
    }
}
