public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "radar";
        boolean isPalindrome = true;
        for (int i = 0; i < input.length() / 2; i++) {
            char startChar = input.charAt(i);
            char endChar = input.charAt(input.length() - 1 - i);

            if (startChar != endChar) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input String: " + input);
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}