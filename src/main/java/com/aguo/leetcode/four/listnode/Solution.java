package com.aguo.leetcode.four.listnode;

import java.util.HashMap;

/**
 * @author Code Fruit
 * @date 2021/7/29 16:38
 * @Email 126089205@qq.com
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int a = 0;
        HashMap<Integer,ListNode> listNodeHashMap = new HashMap<>();
        ListNode listNode = new ListNode();
        ListNode l = listNode;
        while(head.next != null){
            listNodeHashMap.put(a + 1, head.next);
            head = head.next;
            a++;
        }
        listNodeHashMap.remove(a - n);
        for (int i = 0; i < listNodeHashMap.size(); i++) {
            l.next = listNode.
        }
        System.out.println(a);
        return head;
    }
}
