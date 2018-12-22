package top.daoyang.easy;

public class LastWordLength {
    public static void main(String[] args) {
        LastWordLength lastWordLength = new LastWordLength();
        System.out.println(lastWordLength.lengthOfLastWord("b   aqwer wqerwe    "));
//        System.out.println(" ".trim().equals(""));
    }

    public int lengthOfLastWord(String s) {
        int res = 0;
        int last = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!s.substring(i, i + 1).trim().equals("")) {
                res++;
                last = res;
            }
            else {
                res = 0;
            }
        }

        if (res == 0) return last;
        return res;
    }
}
