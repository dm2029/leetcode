package ru.sukebe.leetcode.problems.palindromenumber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testIsPalindrome() {
        Solution PalindromeNumberSolution = new Solution();
        int x = 964737469;
        boolean result = PalindromeNumberSolution.isPalindrome(x);
        assertEquals(true, result);
    }

    @Test
    void testIsNotPalindrome() {
        Solution PalindromeNumberSolution = new Solution();
        int x = 964737468;
        boolean result = PalindromeNumberSolution.isPalindrome(x);
        assertEquals(false, result);
    }
}