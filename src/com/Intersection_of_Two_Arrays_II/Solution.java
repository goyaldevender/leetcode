package com.Intersection_of_Two_Arrays_II;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        // Create a hashMap of all the elements in nums1 and maintain their count
        Map<Integer, Integer> myMap = new HashMap();
        List<Integer> al = new ArrayList<>();

        for (int aNums1 : nums1) {
            if (myMap.containsKey(aNums1)) {
                myMap.put(aNums1, myMap.get(aNums1) + 1);
            } else
                myMap.put(aNums1, 1);
        }

        System.out.println(myMap);

        // Loop through all the elements of nums2
        // If the element is found and count is > 0 then insert in the arrayList and decrement the count
        for (int aNums2 : nums2) {
            if (myMap.containsKey(aNums2)) {
                if (myMap.get(aNums2) > 0) {
                    al.add(aNums2);
                    myMap.put(aNums2, myMap.get(aNums2) - 1);
                }
            }
        }

        //  System.out.println(al);

        int[] arr = new int[al.size()];

        for (int i = 0; i < al.size(); i++) {
            arr[i] = al.get(i);
        }

        return arr;
    }
}