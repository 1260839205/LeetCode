package com.aguo.leetcode.four.str;

import org.junit.Test;

import javax.swing.plaf.IconUIResource;
import java.util.HashSet;

/**
 * @author Code Fruit
 * @date 2021/7/29 11:34
 * @Email 126089205@qq.com
 */
public class OnlyStr {

    @Test
    public void test(){
        System.out.println(isUnique("letcod"));
    }
    public boolean isUnique(String astr) {
        if (astr == null) return false;
        HashSet<Character> set = new HashSet<>();
        char[] chars = astr.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            set.add(chars[i]);
        }
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (set.contains(chars[i])){
                count++;
            }
        }
        if (count > set.size()){
            return false;
        }
        return true;
    }

}
