package com.Keyboard_Row;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int findRowNumber(Character c) {

        c = Character.toLowerCase(c);
        //  System.out.println(c);

        if (c.equals('q') || c.equals('w') || c.equals('e') || c.equals('r')
                || c.equals('t') || c.equals('y') || c.equals('u') || c.equals('i')
                || c.equals('o') || c.equals('p'))
            return 1;
        else if (c.equals('a') || c.equals('s') || c.equals('d') || c.equals('f')
                || c.equals('g') || c.equals('h') || c.equals('j') || c.equals('k')
                || c.equals('l'))
            return 2;
        else if (c.equals('z') || c.equals('x') || c.equals('c') || c.equals('v')
                || c.equals('b') || c.equals('n') || c.equals('m'))
            return 3;
        else return 0;
    }

    public boolean oneRow(String str) {
        boolean oneRowFlag = true;

        int rowNumber = findRowNumber(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            if (rowNumber != findRowNumber(str.charAt(i)))
                oneRowFlag = false;
        }

        return oneRowFlag;
    }

    public String[] findWords(String[] words) {

        List<String> al = new ArrayList<String>();

        for (String str : words) {

            if (oneRow(str))
                al.add(str);
        }

        //    System.out.println(al);

        String[] arrStr = new String[al.size()];

        for (int i = 0; i < al.size(); i++) {
            arrStr[i] = al.get(i);
        }

        for (int i = 0; i < al.size(); i++) {
            System.out.println(arrStr[i]);
        }

        return arrStr;
    }
}