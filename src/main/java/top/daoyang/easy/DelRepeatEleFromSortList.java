package top.daoyang.easy;

import java.util.ArrayList;
import java.util.List;

public class DelRepeatEleFromSortList {

    public static void main(String[] args) {
        DelRepeatEleFromSortList delRepeatEleFromSortList = new DelRepeatEleFromSortList();
        delRepeatEleFromSortList.removeDuplicates(new int[] {1, 2, 2, 3, 3, 3, 4});
    }
    public int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
            }
        }

        System.out.println(list.toString());

        for (int i = 0; i < list.size(); i++) {
            if (nums[i] <= list.get(i)) {
                nums[i] = list.get(i);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        return list.size();
    }

    public int removeDuplicates2(int[] nums) {
        if (nums.length == 0)
            return 0;

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i ++;
                nums[i] = nums[j];
            }
        }

        return i;
    }
}
