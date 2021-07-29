package com.aguo.leetcode.four.midnum;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Code Fruit
 * @date 2021/7/29 12:47
 * @Email 126089205@qq.com
 */
public class MiddleNum {
    @Test
    public void test(){
        System.out.println(findMedianSortedArrays(new int[]{1,2},new int[]{3,4}));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] num = new int[nums1.length + nums2.length];
        /*for (int i = 0; i < num.length; i++) {
            if (i < nums1.length){
                num[i] = nums1[i];
            }
            if (i >= nums1.length){
                num[i] = nums2[i - nums1.length];
            }
        }
        sort(num,0,num.length - 1);*/

        if (num.length % 2 == 0){
            return (double) ((num[num.length / 2]+num[num.length / 2 - 1]))/(double)2;
        }else {
            return num[num.length / 2];
        }
    }

    public int[] sort(int[] num,int left, int right){
        if (left >= right){
            return num;
        }

        int base = num[left],i = left,a = right;
        while(i < a){
            while(i < a && num[a] >= base ){
                a--;
            }

            while(i < a && num[i] <= base ){
                i++;
            }

            if (i < a ){
                exchange(num,i,a);
            }
        }
        exchange(num,left,i);
        sort(num,left,i - 1);
        sort(num,i + 1, right);
        return num;
    }

    private int[] exchange(int[] arr,int i, int j){
        if (i == j) {
            return arr;
        }
        int num;
        num = arr[i];
        arr[i] = arr[j];
        arr[j] = num;
        return arr;
    }
}
