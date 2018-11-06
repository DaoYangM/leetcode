package top.daoyang.easy;

public class BinaryAddOne {
    public static void main(String[] args) {
        BinaryAddOne binaryAddOne = new BinaryAddOne();
        System.out.println(binaryAddOne.addBinary("1111", "1111"));
    }

    public String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            String t = b;
            b = a;
            a = t;
        }
        boolean needCarry = false;
        String res = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            int ai = Integer.parseInt(a.substring(i, i + 1));
            int bi = 0;
            if (b.length() > (a.length() - 1 - i)) {
                bi = Integer.parseInt(b.substring(b.length() - 1 - (a.length() - 1 - i) , b.length() - (a.length() - 1 - i)));
            }

            int sum = ai + bi;
            if (needCarry) sum += 1;

            if (sum == 0) {
                res = "0" + res;
                needCarry = false;
            }
            if (sum == 1) {
                res = "1" + res;
                needCarry = false;
            } else if (sum == 2) {
                needCarry = true;
                res = "0" + res;
            } else if (sum == 3) {
                needCarry = true;
                res = "1" + res;
            }
        }
        if (needCarry) res = "1" + res;
        return res;
    }
}
