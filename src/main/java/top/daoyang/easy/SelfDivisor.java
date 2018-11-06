package top.daoyang.easy;

import java.util.ArrayList;
import java.util.List;

public class SelfDivisor {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            boolean flag = true;
            for (int j = i; j != 0; j = j / 10) {
                if (j % 10 == 0 || i % (j % 10) != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        SelfDivisor selfDivisor = new SelfDivisor();
        System.out.println(selfDivisor.selfDividingNumbers(1, 22));
    }
}
