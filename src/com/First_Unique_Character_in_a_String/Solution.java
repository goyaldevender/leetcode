package com.First_Unique_Character_in_a_String;

public class Solution {
    public int firstUniqChar(String s) {

        for (int i = 0; i < s.length(); i++)
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
                return i;

        return -1;
    }
}