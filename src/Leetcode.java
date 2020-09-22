import ru.sukebe.leetcode.problems.palindromenumber.Solution;

import java.text.MessageFormat;

public class Leetcode {
    public static void main(String[] args) {
        Solution PalindromeNumberSolution = new Solution();
        int x = 964737469;
        boolean result = PalindromeNumberSolution.isPalindrome(x);
        System.out.println(MessageFormat.format("Result for {0} is {1}", x, result));
    }
}
