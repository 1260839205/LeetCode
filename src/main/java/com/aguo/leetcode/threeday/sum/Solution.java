package com.aguo.leetcode.threeday.sum;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Code Fruit
 * @date 2021/7/28 9:50
 * @Email 126089205@qq.com
 */
public class Solution {

    @Test
    public void test() {
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        l1.val = 8;
        l1.next = new ListNode();
        l1.next.val = 2;
        l2.val = 2;
        l2.next = new ListNode();
        l2.next.val = 8;
        ListNode listNode = this.addTwoNumbers(l1, l2);
        System.out.println(listNode.next.next.val);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) return null;
        int a = 0;
        List<ListNode> listNodes = new ArrayList<>();
        while (l1 != null || l2 != null || a != 0) {
            if (l1 != null) {
                a += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                a += l2.val;
                l2 = l2.next;
            }

            listNodes.add(new ListNode(a >= 10 ? a % 10 : a));
            a = (a >= 10 ? a / 10 : 0);

        }
        for (int i = 0; i < listNodes.size() - 1; i++) {
            listNodes.get(i).next = listNodes.get(i + 1);
        }

        return listNodes.get(0);

    }


    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) return null;
        int a = 0;
        ListNode listNode = new ListNode(a);
        ListNode listNode2 = listNode;
        while (l1 != null || l2 != null || a != 0) {
            if (l1 != null) {
                a += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                a += l2.val;
                l2 = l2.next;
            }
            ListNode b = new ListNode(a >= 10 ? a % 10 : a);
            a = (a >= 10 ? a / 10 : 0);
            listNode2.next = b;
            listNode2 = b;
        }
        return listNode.next;

    }


}
