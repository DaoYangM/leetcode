package top.daoyang.easy;

import java.util.ArrayList;
import java.util.List;

public class YangHuiTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> item = new ArrayList<>(i + 1);
            for(int j = 0; j < i + 1; j ++) {
                if (j == 0 || j == i) {
                    item.add(j, 1);
                } else {
                    if (i > 1)
                        item.add(j, res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                }
            }
            res.add(item);
        }
        return res;
    }

    public static void main(String[] args) {
        YangHuiTriangle yangHuiTriangle = new YangHuiTriangle();
        yangHuiTriangle.generate(5);
    }
}