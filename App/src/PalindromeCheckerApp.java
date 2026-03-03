public class PalindromeCheckerApp {public static void main(String[] args) {
        // Define the input string
        String input = "A man a plan a canal Panama";

        // Normalize the string: remove non-alphanumeric characters and convert to lower case
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Flag to track palindrome state
        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {

            // Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break; // Exit the loop early if a mismatch is found
            }
        }

        // Display the expected output
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}