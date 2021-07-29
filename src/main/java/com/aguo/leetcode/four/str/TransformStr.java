package com.aguo.leetcode.four.str;

import org.junit.Test;

import java.util.*;

/**
 * @author Code Fruit
 * @date 2021/7/29 13:31
 * @Email 126089205@qq.com
 */
public class TransformStr {

    @Test
    public void test(){
        String s1 = "ab c", s2 = "abc";
        System.out.println(CheckPermutation(s1,s2));
        System.out.println(replaceSpaces(s1,4));
    }

    public boolean CheckPermutation(String s1, String s2) {
        if (s1 == null || s2 == null || !(s1.length() == s2.length()) ){
            return false;
        }
        char[] chars = s1.toCharArray();
        char[] chars1 = s2.toCharArray();
        int a = 0;
        for (int i = 0; i < chars.length; i++) {
            a += chars[i];
            a -= chars1[i];
        }
        return a == 0 ? true : false;
        /*List<Character> list = new ArrayList<>();
        char[] chars = s1.toCharArray();
        char[] chars1 = s2.toCharArray();
        boolean[] flag = new boolean[s1.length()];
        boolean f = true;
        for (char aChar : chars) {
            list.add(aChar);
        }
        for (int i = 0; i < chars1.length; i++) {
            flag[i] = list.contains(chars1[i]);
            if(flag[i]) list.remove(list.indexOf(chars1[i]));
            f = f && flag[i];
        }
        return f;*/
    }


    private static final String STR = "%20";
    public String replaceSpaces(String S, int length) {

        return S.replace(" ","%20");
    }

    @Test
    public void test2(){
        int[] nums = new int[]{1,2,3,4};
        exchange(nums);
    }

    public int[] exchange(int[] nums) {
        List<Integer> num = new ArrayList<>();
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0 ){
                num.add(nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 ){
                num.add(nums[i]);
            }
        }
        for (int i = 0; i < num.size(); i++) {
            a[i] = num.get(i);
        }
        return a;
    }
}
