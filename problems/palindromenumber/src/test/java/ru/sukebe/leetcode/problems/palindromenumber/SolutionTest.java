package ru.sukebe.leetcode.problems.palindromenumber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testIsPalindrome() {
        Solution PalindromeNumberSolution = new Solution();
        boolean result = PalindromeNumberSolution.isPalindrome(964737469);
        assertEquals(true, result);

        result = PalindromeNumberSolution.isPalindrome(1);
        assertEquals(true, result);
    }

    @Test
    void testIsNotPalindrome() {
        Solution PalindromeNumberSolution = new Solution();
        boolean result = PalindromeNumberSolution.isPalindrome(964737468);
        assertEquals(false, result);
    }

    @Test
    void testNegativeIsNotPalindrome() {
        Solution PalindromeNumberSolution = new Solution();
        boolean result = PalindromeNumberSolution.isPalindrome(-1);
        assertEquals(false, result);
    }
}