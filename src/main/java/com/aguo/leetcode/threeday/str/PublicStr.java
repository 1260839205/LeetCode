package com.aguo.leetcode.threeday.str;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Code Fruit
 * @date 2021/7/28 16:51
 * @Email 126089205@qq.com
 */
public class PublicStr {

    @Test
    public void test(){
       String[] strs = {"flower","flow","flight"};
       String[] str2 = {"dog","racecar","car"};
        System.out.println(this.longestCommonPrefix(str2));
    }

    public String longestCommonPrefix(String[] strs) {
            if (strs.length <= 0) return "";
            String[] strings = new String[strs.length];
            List<Integer> list = new ArrayList<>();
            boolean a = true;
            for (int i = 0; i < strs.length; i++) {
                list.add(strs[i].length());
            }
            String str = null;
            Integer min = Collections.min(list);
            for (int integer = 0; integer < min; integer++) {
                for (int i = 0; i < strs.length ; i++) {
                    strings[i] = strs[i].substring(0,integer +1);
                }
                for (int i = 0; i < strings.length - 1; i++) {
                    a = (a && strings[i].equals(strings[i + 1]));
                }
                str = a ? strings[0] : str;
            }
            return str==null? "" : str;
    }
}
