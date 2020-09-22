package ru.sukebe.leetcode.problems.palindromenumber;

import java.util.ArrayList;

/**
 * 9. Palindrome Number
 * @url https://leetcode.com/problems/palindrome-number/
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) {
            return false;
        }
        else if (x<10) {
            return true;
        }
        else {
            ArrayList<Integer> arrayX = intToArray(x);
            int numSteps = numSteps(arrayX);
            for (int i=0; i<numSteps; i++) {
                if (arrayX.get(i) != arrayX.get(arrayX.size() - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    }

    private ArrayList<Integer> intToArray(int x)
    {
        ArrayList<Integer> array = new ArrayList<Integer>();
        do {
            array.add(x % 10);
            x /= 10;
        } while  (x > 0);
        return array;
    }

    // half the length of the initial value (rounded to ceil, i.e. 6 for value "11")
    private int numSteps(ArrayList<Integer> x)
    {
        Double half = Math.ceil( (double)x.size() / 2);
        return half.intValue();
    }
}