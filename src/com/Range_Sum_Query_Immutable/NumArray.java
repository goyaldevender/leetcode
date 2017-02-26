package com.Range_Sum_Query_Immutable;


import java.util.ArrayList;
import java.util.List;

public class NumArray {

    List sumAl;

    public NumArray(int[] nums) {

        sumAl = new ArrayList(nums.length);


        int currSum = 0;

        if (nums.length != 0)
            sumAl.add(0, nums[0]);

        for (int i = 1; i < nums.length; i++) {
            sumAl.add(i, (Integer) sumAl.get(i - 1) + nums[i]);
        }

    }

    public int sumRange(int i, int j) {

        if (i > 0)
            return (Integer) sumAl.get(j) - (Integer) sumAl.get(i - 1);
        else
            return (Integer) sumAl.get(j);

    }
}