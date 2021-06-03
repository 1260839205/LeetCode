package com.aguo.leetcode.firstday;

import java.util.Arrays;

/**
 * @Author Code Fruit
 * @Email 1260839205@qq.com
 * @Date 2021/6/3 下午7:38
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{2, 7, 11, 15}, 9)));

    }
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++ ){
            for(int j = 0; j < nums.length; j++ ){
                if(i != j && nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
