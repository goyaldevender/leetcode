package com.Kth_Largest_Element_in_an_Array;

import java.util.*;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        List al = new ArrayList();

        al.addAll(Arrays.asList(nums));

        Queue<Integer> pq = new PriorityQueue<Integer>(al.size(), Collections.reverseOrder());
        pq.addAll(al);

        for (int i = 0; i < k - 1; i++) {
            pq.remove();
        }

        return pq.peek();
    }
}