package com.saunfa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestString {


    public static void reverseString() {
        String str = "asdfghjkl";
        char[] tmp = str.toCharArray();
        System.out.println("原字符串，" + Arrays.toString(tmp));
        for (int i = 0; i < tmp.length / 2; i++) {
            char t = tmp[i];
            tmp[i] = tmp[tmp.length - i - 1];
            tmp[tmp.length - i - 1] = t;
        }
        System.out.println("后字符串，" + Arrays.toString(tmp));
    }

    // 异位词(相同的字符个数相等)
    public static void isAnagram() {
        String s = "anagram";
        String t = "nagaram";
        char[] chars = new char[26];
        for (char c : s.toCharArray()) {
            chars[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            chars[c - 'a']--;
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 0)
                System.out.println("是异位词");
            else
                System.out.println("不是异位词");
        }


    }

    public static void isAnagram1() {
        String s = "anagram";
        String t = "agaram";
        Map<Character,Integer> tmp=new HashMap<>();
        for (char c : s.toCharArray()) {
            Integer count=0;
            if (tmp.containsKey(c)){
                count=tmp.get(c);
            }
            tmp.put(c,++count);
        }
        for (char c : t.toCharArray()) {
            if (tmp.containsKey(c)){
                Integer count=tmp.get(c);
                if (count>1){
                    tmp.put(c,--count);
                }else {
                    tmp.remove(c);
                }
            }
        }
       if (tmp.size()==0){
           System.out.println("是异位词");
       }else {
           System.out.println("不是异位词");
       }


    }

    public static void main(String[] args) {
        reverseString();
        isAnagram();
//        isAnagram1();
    }

}
