package com.aguo.leetcode.threeday.reverse;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Code Fruit
 * @date 2021/7/28 15:07
 * @Email 126089205@qq.com
 */
public class ReverseNum {

    @Test
    public void test(){
        System.out.println(this.reverse(-2147483648));
    }

    public int reverse(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;
    }
}
