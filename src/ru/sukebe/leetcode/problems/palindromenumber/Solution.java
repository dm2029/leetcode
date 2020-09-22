package ru.sukebe.leetcode.problems.palindromenumber;

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
            String stringifiedNumber = String.valueOf(x);
            int numSteps = numSteps(stringifiedNumber);
            for (int i=0; i<numSteps; i++) {
                if (stringifiedNumber.charAt(i) != stringifiedNumber.charAt(stringifiedNumber.length() - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    }

    // half the length of the initial value (rounded to ceil, i.e. 6 for value "11")
    private int numSteps(String stringifiedNumber)
    {
        Double half = Math.ceil( (double)stringifiedNumber.length() / 2);
        return half.intValue();
    }
}