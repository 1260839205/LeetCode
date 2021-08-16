package com.aguo.leetcode.six.listnode;


import com.aguo.leetcode.threeday.sum.ListNode;
import org.junit.Test;

import java.util.*;

/**
 * @author Code Fruit
 * @date 2021/8/3 14:20
 * @Email 126089205@qq.com
 */
public class KthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) return null;
        ListNode tmap = head;
        int len = 1;
        while(tmap.next != null){
            len++;
            tmap = tmap.next;
        }
        if (len == k) return tmap;
        tmap = head;
        for (int i = 1; i < len; i++) {
            if (i == len - k - 1){
                return tmap.next;
            }
            tmap = tmap.next;
        }
        return null;
    }


    public int kthToLast(ListNode head, int k) {
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }

        for (int i = 0; i < len; i++) {
            if (i == len - k){
                return temp.val;
            }
            temp = temp.next;
        }
        return 0;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int len = 0;
        while(temp != null) {
            len++;
            temp = temp.next;
        }
        temp = head;
        for (int i = 0; i < len; i++) {
            if (i == len - n - 1 ) {
                temp.next = temp.next.next;
                return head;
            }
            if (temp.next == null && len == n){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode temp = null;
        while (head != null){
            ListNode l = head.next;
            head.next = temp;
            temp = head;
            head = l;
        }
        return temp;
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = 0; i1 < nums.length; i1++) {
                if (i != i1 && target - nums[i] == nums[i1]){
                    return new int[]{i,i1};
                }
            }
        }
        return null;
    }

    public String longestPalindrome(String s) {
        if (s.length() <= 1) return s;
        if (s.length() == 2 && s.charAt(0) != s.charAt(1)) return String.valueOf(s.charAt(0));
        char[] chars = s.toCharArray();
        String s1 = null;
        int left = 0, right = 0;
        if (s.length() % 2 == 0) {
            left = s.length() / 2 - 1;
            right = left + 1;
        }else {
            left = (int) Math.ceil((double) s.length() / 2) - 2;
            right = left + 2;
            s1 = s.substring(left ,left + 1);
        }
        for (int i = 0; i < s.length() / 2; i++) {
            if (chars[left] == chars[right]){
                s1 = s.substring(left ,right + 1);
            }else if (s1 != null){
                return s1;
            }else {
                return null;
            }
            left--;
            right++;
        }
        return s1;
    }

    @Test
    public void test(){
        String s = "ccc";
        System.out.println(longestPalindrome(s));
    }

    public int[] reversePrint1(ListNode head) {
        ListNode temp = null;
        int len = 0,n = 0;
        while (head != null){
            len++;
            ListNode l = head.next;
            head.next = temp;
            temp = head;
            head = l;
        }
        int[] nums = new int[len];
        while (temp != null){
            nums[n] = temp.val;
            temp = temp.next;
            n++;
        }
        return nums;
    }

    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode l = head;
        while (l != null){
            stack.add(l);
            l = l.next;
        }
        int[] nums = new int[stack.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = stack.pop().val;
        }
        return nums;
    }

    public int[] printNumbers(int n) {
        if (n == 0) return null;
        int[] nums = new int[(int) Math.pow(10,n) - 1];
        numbers(nums,n - 1);
        return nums;
    }

    public void numbers(int[] nums , int n){
        if (n == -1) return ;
        int num = (int) Math.pow(10,n);
        while(num < (int) Math.pow(10,n + 1)){
            if (num == 0) break;
            nums[num - 1] = num;
            num++;
        }
        numbers(nums,n - 1);
    }

    @Test
    public void test1(){
        int[] ints = printNumbers(2);
        for (int anInt : ints) {
            System.out.println(anInt);
        }

        print(5);
    }

    public void print(int n){
        if ( n <= 0) return;
        for (int i = 0; i <= 5 - n; i++) {
            System.out.print("*");
        }
        System.out.println();
        print(n - 1);
    }


    public int[] plusOne(int[] digits) {
        if (digits.length < 1) return digits;
        digits[digits.length - 1] = (digits[digits.length - 1] + 1) % 10;
        digits[digits.length - 2] = (digits[digits.length - 1] + 1) / 10;
        return null;
    }

    public static int[] hebing(int[] a,int[] b){
        /*if (a.length <= 0) return b;
        if (b.length <= 0) return a;
        int[] c = new int[a.length + b.length];
        if (a[0] > b[b.length - 1] ) {
            for (int i = 0; i < c.length; i++) {
                if (i < a.length){
                    c[i] = a[i];
                }else {
                    c[i] = b[i - a.length];
                }
            }
            return c;
        }else if (b[0] > a[a.length - 1]){
            for (int i = 0; i < c.length; i++) {
                if (i < b.length){
                    c[i] = b[i];
                }else {
                    c[i] = a[i - b.length];
                }
            }
            return c;
        }*/
        int[] c = new int[a.length + b.length];
        int lefta = 0,leftb = 0,len = 0;
        while (lefta < a.length && leftb < b.length){
            if (a[lefta] < b[leftb]){
                c[len++] = a[lefta++];
            }else{
                c[len++] = b[leftb++];
            }
        }

        while (lefta < a.length){
            c[len++] = a[lefta++];
        }
        while (leftb < b.length){
            c[len++] = b[leftb++];
        }

        return c;
    }

    public static void main(String[] args) {
        int[] a = {1,3,5};
        int[] b = {2,4,6,8};
        int[] hebing = hebing(a, b);
        for (int i : hebing) {
            System.out.println(i);
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m + n];
        int lefta = 0,leftb = 0,len = 0;
        while (lefta < nums1.length && leftb < nums2.length){
            if (nums1[lefta] < nums2[leftb]){
                nums[len++] = nums1[lefta++];
            }else{
                nums[len++] = nums2[leftb++];
            }
        }

        while (lefta < nums1.length){
            nums[len++] = nums1[lefta++];
        }
        while (leftb < nums2.length){
            nums[len++] = nums2[leftb++];
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = nums[i];
        }
    }

    @Test
    public void testn(){
        permute(new int[]{1,2,3});
        Date date=new Date();
        System.out.printf("%tD%n",date);
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> numLists = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            numList.add(num);
        }

        permute(numLists,numList,0);
        System.out.println(numLists);
        return numLists;
    }

    public void permute(List<List<Integer>> numLists,List<Integer> numList,int start){
        if (start == numList.size() - 1){
            numLists.add(numList);
        }
        for (int i = start; i < numList.size(); i++) {
            // 动态维护数组
            Collections.swap(numList, start, i);
            // 继续递归填下一个数
            permute(numLists, numList, start + 1);
            // 撤销操作
            Collections.swap(numList, start, i);
        }
    }


}
