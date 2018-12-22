package top.daoyang.easy;

public class AddDigits {
    public int addDigits(int num) {
        if (num / 10 == 0)
            return num;
        
        int res = 0;
        while (num != 0) {
            res += num % 10;
            num /= 10;
        }

        return addDigits(res);
    }

    public static void main(String[] args) {
        AddDigits addDigits = new AddDigits();
        System.out.println(addDigits.addDigits(38));
    }
}