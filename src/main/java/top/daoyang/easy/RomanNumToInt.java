package top.daoyang.easy;

public class RomanNumToInt {
    public static void main(String[] args) {
        RomanNumToInt romanNumToInt = new RomanNumToInt();

        System.out.println(romanNumToInt.romanToInt("IX"));
//        System.out.println("123".substring(0, 1));
    }


    public int romanToInt(String s) {
        int res = 0;
        if (s.contains("IV")) {
            s = s.replaceAll("IV", "");
            res = res + 4;
        }
        if (s.contains("IX")) {
            s = s.replaceAll("IX", "");
            res = res + 9;
        }
        if (s.contains("XL")) {
            s = s.replaceAll("XL", "");
            res = res + 40;
        }
        if (s.contains("XC")) {
            s = s.replaceAll("XC", "");
            res = res + 90;
        }
        if (s.contains("CD")) {
            s = s.replaceAll("CD", "");
            res = res + 400;
        }
        if (s.contains("CM")) {
            s = s.replaceAll("CM", "");
            res = res + 900;
        }

        for (int i = 0; i < s.length(); i++) {
            switch (s.substring(i, i + 1)) {
                case "I":
                    res += 1;
                    break;
                case "V":
                    res += 5;
                    break;
                case "X":
                    res += 10;
                    break;
                case "L":
                    res += 50;
                    break;
                case "C":
                    res += 100;
                    break;
                case "D":
                    res += 500;
                    break;
                case "M":
                    res += 1000;
                    break;
            }
        }

        return res;
    }
}
