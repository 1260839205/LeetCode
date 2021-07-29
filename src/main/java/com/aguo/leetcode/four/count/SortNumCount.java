package com.aguo.leetcode.four.count;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Code Fruit
 * @date 2021/7/29 8:43
 * @Email 126089205@qq.com
 */
public class SortNumCount {
    @Test
    public void test(){
        System.out.println(search(new int[]{1},0));
    }
    public int search(int[] nums, int target) {
        if(nums.length <= 0) return 0;
        int left = 0,right = nums.length - 1,count = 0;
        while( left <= right){

        }
        return right-left;
    }
}
