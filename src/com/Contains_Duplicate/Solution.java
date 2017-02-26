package com.Contains_Duplicate;

import java.util.HashMap;

public class Solution {
    public boolean containsDuplicate(int[] nums) {

        boolean duplicateFlag = true;

        HashMap<Integer, Integer> myMap = new HashMap<>();

        if (nums.length == 0)
            return false;

        for (int num : nums) {
            if (myMap.containsKey(num))
                return true;
            else
                myMap.put(num, 1);
        }

        return false;
    }
}