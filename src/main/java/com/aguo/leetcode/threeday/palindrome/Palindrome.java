package com.aguo.leetcode.threeday.palindrome;

import org.junit.Test;

/**
 * @author Code Fruit
 * @date 2021/7/28 16:09
 * @Email 126089205@qq.com
 */
public class Palindrome {
    @Test
    public void test(){
        System.out.println(this.isPalindrome(121));
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }else if (x == 0) {
            return true;
        }
        int n = 0,b = x;
        while(x != 0){
            n = n * 10 + x % 10;
            x = x / 10;
        }
        System.out.println(b==n);
        return b == n ? true : false;
    }
}
