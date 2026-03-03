public class PalindromeCheckerApp {public static void main(String[] args) {
        String input = "madam";

        // Call the recursive method starting with the first and last indices
        boolean isPalindrome = check(input, 0, input.length() - 1);

        // Display the expected output
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
    private static boolean check(String s, int start, int end) {
        // Base Condition 1: If the pointers meet or cross, all checks passed
        if (start >= end) {
            return true;
        }

        // Base Condition 2: If characters at current pointers don't match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive Call: Move the start pointer forward and end pointer backward
        return check(s, start + 1, end - 1);
    }
}