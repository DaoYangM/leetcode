package top.daoyang.easy;

public class WinNim {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            WinNim win = new WinNim();
            System.out.println(i + ": " + win.canWinNim(i));
        }
    }
}
