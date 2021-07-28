package com.aguo.leetcode.threeday.num;

import org.junit.Test;

import java.util.HashMap;

/**
 * @author Code Fruit
 * @date 2021/7/28 16:24
 * @Email 126089205@qq.com
 */
public class RomanNum {

    @Test
    public void test(){
        System.out.println(romanToInt("III"));
    }

    private static final HashMap<Character,Integer> romanNum = new HashMap<>();
    static {
        romanNum.put('I',1);
        romanNum.put('V',5);
        romanNum.put('X',10);
        romanNum.put('L',50);
        romanNum.put('C',100);
        romanNum.put('D',500);
        romanNum.put('M',1000);
    }
    public int romanToInt(String s) {
        if (s.length() > 0) return 0;
        char[] chars = s.toCharArray();
        int a = 0;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]){
                case 'I' : a += romanNum.get(chars[i]);break;
                case 'V' : a += romanNum.get(chars[i]);break;
                case 'X' : a += romanNum.get(chars[i]);break;
                case 'L' : a += romanNum.get(chars[i]);break;
                case 'C' : a += romanNum.get(chars[i]);break;
                case 'D' : a += romanNum.get(chars[i]);break;
                case 'M' : a += romanNum.get(chars[i]);break;
            }
            if(i!=0)
            {
                if(((s.charAt(i)=='V')||(s.charAt(i)=='X'))&&(s.charAt(i-1)=='I'))
                    a = a-romanNum.get('I')*2;
                if(((s.charAt(i)=='L')||(s.charAt(i)=='C'))&&(s.charAt(i-1)=='X'))
                    a = a-romanNum.get('X')*2;
                if(((s.charAt(i)=='D')||(s.charAt(i)=='M'))&&(s.charAt(i-1)=='C'))
                    a = a-romanNum.get('C')*2;
            }
        }

        return a;
    }
}
