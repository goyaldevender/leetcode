package com.Detect_Capital;

public class Solution {
    public boolean detectCapitalUse(String word1) {

        String word2 = new String(word1);

        if (word2.toLowerCase().equals(word1)) {
            return true;
        } else if (word2.toUpperCase().equals(word1)) {
            return true;
        } else {
            if (65 <= word1.charAt(0) && word1.charAt(0) <= 90) {
                if (word1.substring(1).equals(word1.substring(1).toLowerCase()))
                    return true;
                else return word1.substring(1).equals(word1.substring(1).toUpperCase());
            } else
                return false;
        }
    }
}