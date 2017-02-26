package com.Word_Pattern;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public boolean wordPattern(String pattern, String str) {


        // Make ArrayList<String> from the str by splitting on space delimiter

        // make a Map
        // if the entry of pattern is present in the map then
        // check if the stored value matches the current of str
        // if entry is not present then insert the value

        String[] splitString = str.split(" ");

        if (splitString.length != pattern.length()) return false;

        for (String aSplitString : splitString) {
            System.out.println(aSplitString);
        }

        List<String> al = Arrays.asList(splitString);

        Map<Character, String> myMap1 = new HashMap<>();
        Map<String, Character> myMap2 = new HashMap<>();

        boolean ansFlag = true;

        for (int i = 0; i < al.size(); i++) {
            if (myMap1.containsKey(pattern.charAt(i))) {
                if (!myMap1.get(pattern.charAt(i)).equals(al.get(i))) {
                    ansFlag = false;
                }
            } else
                myMap1.put(pattern.charAt(i), al.get(i));

        }

        boolean ansFlag2 = true;
        for (int i = 0; i < al.size(); i++) {
            if (myMap2.containsKey(al.get(i))) {
                if (!myMap2.get(al.get(i)).equals(pattern.charAt(i))) {
                    ansFlag2 = false;
                }
            } else
                myMap2.put(al.get(i), pattern.charAt(i));

        }

        return ansFlag && ansFlag2;
    }
}