package com.Climbing_Stairs;

public class Solution {
    public int climbStairs(int n) {
        int count = 0;

        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        // climbStairs(n) = climbStairs(n-1) + climbStairs(n-2)

        int x = 1, y = 2, temp;

        for (int i = 0; i < n - 2; i++) {
            temp = y;
            y = x + y;
            x = temp;
        }

        // 3: 1,2 : 2,1: 1 1 1
        return y;

    }
}