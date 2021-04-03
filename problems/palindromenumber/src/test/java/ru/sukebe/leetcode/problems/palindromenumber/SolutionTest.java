package ru.sukebe.leetcode.problems.palindromenumber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 11, 121, 964737469})
    void testIsPalindrome(int argument) {
        Solution PalindromeNumberSolution = new Solution();
        assertEquals(true, PalindromeNumberSolution.isPalindrome(argument));
    }

    @ParameterizedTest
    @ValueSource(ints = { 12, 123, -1, -11})
    void testIsNotPalindrome(int argument) {
        Solution PalindromeNumberSolution = new Solution();
        assertEquals(false, PalindromeNumberSolution.isPalindrome(argument));
    }

}