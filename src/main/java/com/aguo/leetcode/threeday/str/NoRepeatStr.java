package com.aguo.leetcode.threeday.str;

import org.junit.Test;

import java.util.*;

/**
 * @author Code Fruit
 * @date 2021/7/28 11:35
 * @Email 126089205@qq.com
 */
public class NoRepeatStr {

    @Test
    public void test(){
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('a',1);
        map.put('b',1);
        map.put('c',1);
        System.out.println(map.containsKey('d'));

        System.out.println(this.getStr("pwwkew"));
        System.out.println("pwwkew".substring(0,6));;
    }


    public int getStr(String s){
        if (s.length() <= 0){
           return 0;
        }
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();
        int right = 0,max = 1,left = 0,d = 0;
        while(right < s.length()){
          if(set.contains(chars[right])){
              if (max < d) max = d;
              set = new HashSet<>();
              left++;
              right = left ;
          }
          set.add(chars[right]);
          d = Math.max(d,right - left + 1);
          right++;
        }
        return max > d ? max : d;
    }
}
