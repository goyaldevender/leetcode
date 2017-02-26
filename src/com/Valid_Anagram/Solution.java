package com.Valid_Anagram;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    Map<Character, Integer> myMap = new HashMap<>();

    public boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (myMap.containsKey(s1.charAt(i)))
                myMap.put(s1.charAt(i), myMap.get(s1.charAt(i)) + 1);
            else
                myMap.put(s1.charAt(i), 1);
        }

        for (int i = 0; i < s2.length(); i++) {
            if (myMap.containsKey(s2.charAt(i))) {
                if (myMap.get(s2.charAt(i)) > 0)
                    myMap.put(s2.charAt(i), myMap.get(s2.charAt(i)) - 1);
                else
                    return false;
            } else
                return false;

        }

        return true;
    }
}