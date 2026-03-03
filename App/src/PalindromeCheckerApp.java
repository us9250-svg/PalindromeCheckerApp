public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Define the input string
        String input = "racecar";

        // Instantiate the service
        PalindromeService service = new PalindromeService();

        // Call the checkPalindrome method
        boolean isPalindrome = service.checkPalindrome(input);

        // Display the expected output
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
class PalindromeService {

    public boolean checkPalindrome(String input) {

        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {
            // Check for mismatch
            if (input.charAt(start) != input.charAt(end)) {
                return false; // Exit immediately if it's not a palindrome
            }
            // Move pointers inward
            start++;
            end--;
        }

        // If the loop finishes without returning false, it is a palindrome
        return true;
    }
}