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
            int halfLength = stringifiedNumber.length() / 2;
            String firstPart = stringifiedNumber.substring(0, halfLength);
            String lastPart = stringifiedNumber.substring(stringifiedNumber.length() - halfLength, stringifiedNumber.length());
            lastPart = new StringBuilder(lastPart).reverse().toString();
            if (firstPart.equals(lastPart)) {
                return true;
            }
            return false;
        }
    }
}