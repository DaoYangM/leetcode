package top.daoyang.easy;

public class CountPrimeSetBits {
    public int countPrimeSetBits(int L, int R) {
        int res = 0;

        for (int i = L; i <= R; i++) {
            String b = Integer.toBinaryString(i);
            int s = 0;
            for (int j = 0; j < b.length(); j++) {
                if (b.substring(j, j+1).equals("1"))
                    s++;
            }
            if (s != 1 && isZ(s)) {
                res++;
                System.out.println("z " + s);
            }
        }
        return res;
    }

    private boolean isZ(int s) {
        for (int i = 2; i < s; i++) {
            if (s % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new CountPrimeSetBits().countPrimeSetBits(244, 269));
    }
}
