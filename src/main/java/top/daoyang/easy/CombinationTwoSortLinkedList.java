package top.daoyang.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class CombinationTwoSortLinkedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        List<Integer> list1 = new ArrayList<>();

        while (l1 != null) {
            list1.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            list1.add(l2.val);
            l2 = l2.next;
        }

        Collections.sort(list1);

        ListNode listNode = null, head = null;
        for (Integer item : list1) {
            if (listNode == null) {
                listNode = new ListNode(item);
                head = listNode;
            } else {
                listNode.next = new ListNode(item);
                listNode = listNode.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(3);

        CombinationTwoSortLinkedList combinationTwoSortLinkedList = new CombinationTwoSortLinkedList();
        ListNode listNode = combinationTwoSortLinkedList.mergeTwoLists(l1, l2);

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
