package com.Maximum_Subarray;


public class Solution {

    // For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
    //  the contiguous subarray [4,-1,2,1] has the largest sum = 6

    public int maxSubArray(int[] nums) {
        // Loop through the array
        // Maintain a currSum and maxSum Variable
        // if the number is positive add it to the currSum and check
        // if the currSum > nums
        // if currSum < 0;
        //  make currSum = 0
        // if maxSum = -1;
        //  loop through the array and print the min number

        int maxSum = -1, currSum = 0;

        if (nums.length == 0)
            return 0;

        for (int i = 0; i < nums.length; i++) {
            currSum = currSum + nums[i];

            if (currSum < 0)
                currSum = 0;

            if (currSum > maxSum)
                maxSum = currSum;
        }

        if (maxSum <= 0) {
            int currMax = nums[0];
            for (int i = 0; i < nums.length; i++) {
                currMax = Math.max(currMax, nums[i]);
            }
            maxSum = currMax;
        }

        return maxSum;
    }
}


