package com.aguo.leetcode.fiveday.arithmetic;

import org.junit.Test;

/**
 * @author Code Fruit
 * @date 2021/8/2 15:14
 * @Email 126089205@qq.com
 */
public class Arithmetic {

    @Test
    public void test(){
        int[] arr = {2};
        sort(arr, 0, arr.length - 1);

    }

    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length <= 2) return false;
        sort(arr, 0, arr.length - 1);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] + (arr[1] - arr[0]) ==arr[i + 1]){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }

    public void sort(int[] arr,int left,int right){
        if (left >= right) return ;
        int mid = (right + left) / 2;
        sort(arr,left,mid);
        sort(arr,mid + 1,right);
        sort(arr,left,right,mid);
    }

    public void sort(int[] arr,int left,int right,int mid){
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1,c = 0;
        while(i <= mid && j <= right){
            temp[c++] = arr[i] < arr[j] ? arr[i++] : arr[j++];
        }
        while(i <= mid) {
            temp[c++] = arr[i++];
        }
        while(j <= right) {
            temp[c++] = arr[j++];
        }
        c = 0;
        while(left <=  right){
            arr[left++] = temp[c++];
        }
    }
}
