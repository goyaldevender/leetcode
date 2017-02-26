package com.Reverse_String;

public class Solution {
    public String reverseString(String s) {

        StringBuilder str = new StringBuilder(s);
        str.reverse();

        return (str.toString());
    }
}