package com.aguo.leetcode.four.listnode;

import org.junit.Test;


/**
 * @author Code Fruit
 * @date 2021/7/29 16:38
 * @Email 126089205@qq.com
 */
public class Solution {
    public ListNode removeNthFromEnd1(ListNode head, int val) {

        ListNode l = head;
        while(true){
            if (l.next.val == val){
                l.next = l.next.next;
                break;
            }
            l = l.next;
        }
        return head;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l = head;
        int a = 0;
        while(l != null){
            l = l.next;
            a++;
        }
        l = head;
        for (int i = 0; i < a; i++) {
            if (i == a - n - 1){
                l.next = l.next.next;
                break;
            }
        }

        return head;
    }

    public ListNode reverseList(ListNode head) {
        ListNode a = new ListNode();
        ListNode l = a;
        ListNode temp = head;

        while (temp != null){
            ListNode z = temp.next;
            temp.next = l;
            l = temp;
            temp = temp.next;
        }
        return l;
    }



    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode l = head;
        ListNode s = head;
       while(true){
           l = l.next;
           s = s.next.next;
           if (l == s){
               return true;
           }
       }
    }

    public int myAtoi(String s) {
        if (s.length() <= 0 || s == null) return 0;
        char[] chars = s.toCharArray();
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' '){
                s1.append(s.substring(i,s.length()));
                break;
            }
        }
        chars = s1.toString().toCharArray();
        s1 = null;
        int a = 1;
        StringBuilder sb = new StringBuilder();
        try{
            if (chars[0] == '+' && s.length() > 1){
                for (int i = 1; i < chars.length ; i++) {
                    if (chars[i] >='0' && chars[i] <= '9' ){
                        sb.append(chars[i]);
                    }else {
                        break;
                    }
                }
                return sb.length() > 0?Integer.parseInt(sb.toString()) * a : 0;
            }else if (chars[0] == '-' && s.length() > 1){
                a = -1;
                for (int i = 1; i < chars.length ; i++) {
                    if (chars[i] >='0' && chars[i] <= '9' ){
                        sb.append(chars[i]);
                    }else {
                        break;
                    }
                }
                return sb.length() > 0?Integer.parseInt(sb.toString()) * a : 0;
            }else if (chars[0] >='0' && chars[0] <= '9'){
                sb.append(chars[0]);
                for (int i = 1; i < chars.length ; i++) {
                    if (chars[i] >='0' && chars[i] <= '9' ){
                        sb.append(chars[i]);
                    }else {
                        break;
                    }
                }
                return Integer.parseInt(sb.toString()) * a;
            }
            return 0;
        }catch (NumberFormatException e){
            long i;
            try{
                i = Long.parseLong(sb.toString());
            }catch(NumberFormatException w){
                return a < 0 ?Integer.MAX_VALUE * a - 1 : Integer.MAX_VALUE * a;
            }
            if (i != (int) i){
                return a < 0 ?Integer.MAX_VALUE * a - 1 : Integer.MAX_VALUE * a;
            }
            return 0;
        }catch(ArrayIndexOutOfBoundsException e){
            return 0;
        }

    }

    public int maxArea(int[] height) {
        if (height.length <= 1) return 0;
        maxTwo:for (int i = 0; i < height.length; i++) {
            for (int i1 = i + 1; i1 < height.length; i1++) {
                if (i1 == 3) break maxTwo;
                if (height[i] < height[i1]){
                    int temp = height[i1];
                    height[i] = height[i1];
                    height[i1] = temp;
                }
            }
        }
        System.out.println(height[0]+""+height[1]);
        return 0;
    }

    @Test
    public void test(){
        maxArea(new int[]{1,8,6,2,5,4,8,3,7});
    }


}
