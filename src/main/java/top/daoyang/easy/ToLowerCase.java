package top.daoyang.easy;

public class ToLowerCase {
    public String toLowerCase(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                res += Character.toString((char) (str.charAt(i) + 32));
            } else
                res += str.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        ToLowerCase toLowerCase = new ToLowerCase();
        System.out.println(toLowerCase.toLowerCase("lover"));
        System.out.println(toLowerCase.toLowerCase("LOVER"));
    }
}
