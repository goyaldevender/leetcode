package com.Longest_Palindrome;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int longestPalindrome(String s) {

        HashMap<Character, Integer> myMap = new HashMap();

        // Putting the value for all the characters
        for (int i = 0; i < s.length(); i++) {
            if (myMap.containsKey(s.charAt(i))) {
                myMap.put(s.charAt(i), myMap.get(s.charAt(i)) + 1);
            } else {
                myMap.put(s.charAt(i), 1);
            }
        }

        int ans = 0;
        int odd = 0;

        // Printing the values for all the characters
        for (Map.Entry e :
                myMap.entrySet()) {

            ans = ans + (int) e.getValue() / 2;

            if ((int) e.getValue() % 2 != 0) {
                odd = 1;
            }
        }

        System.out.println(ans * 2 + odd);

        return ans * 2 + odd;
    }

}