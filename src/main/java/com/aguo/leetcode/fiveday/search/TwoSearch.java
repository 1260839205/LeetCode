package com.aguo.leetcode.fiveday.search;

import org.junit.Test;

/**
 * @author Code Fruit
 * @date 2021/8/2 9:55
 * @Email 126089205@qq.com
 */
public class TwoSearch {
    @Test
    public void test(){
        int[] ints = {-1};
        int search = search(ints, -1);
        System.out.println(search);
    }
    public int search(int[] nums, int target) {
        int left = 0 , right = nums.length;
        while(left <= right){
            int mid = (right + left)/2;
            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] > target){
                right = mid - 1;
            }else if (nums[mid] < target){
                left = mid + 1 ;
            }
        }
        return -1;
    }

    public int[] searchRange(int[] nums, int target) {
        int left = 0 , right = nums.length - 1;
        int[] num = new int[nums.length];
        int min = 0 ,max = 0;
        while(left <= right){
            int mid = (right + left)/2;
            if (nums[mid] >= target){

            }else if (nums[mid] < target){
                left = mid + 1 ;
            }
        }

        return null;
    }
}
