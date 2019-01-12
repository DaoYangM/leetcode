package top.daoyang.tencent;

public class MyAtoi {
    public int myAtoi(String str) {
        String trim = str.trim();
        if (trim.equals("")) return 0;

        Character c = trim.charAt(0);
        if (c.equals('-') || c.equals('+') || Character.isDigit(c)) {
            StringBuilder res = new StringBuilder();
            res.append(c);
            char[] charArray = trim.toCharArray();
            for (int i = 1; i < charArray.length; i++) {
                Character ac = charArray[i];
                if (Character.isDigit(ac))
                    res.append(ac);
                else
                    break;
            }

            try {
                int i = Integer.parseInt(res.toString());
            } catch (NumberFormatException e) {
                if ((c.equals('-') || c.equals('+'))&& res.toString().length() == 1) return 0;
                if (c.equals('-')) return Integer.MIN_VALUE;
                else return Integer.MAX_VALUE;
            }
            return Integer.parseInt(res.toString());
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new MyAtoi().myAtoi("+"));
    }
}
