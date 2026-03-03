public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // Define the input string from the example
        String input = "level";

        // Inject the concrete strategy (StackStrategy in this case)
        PalindromeStrategy strategy = new StackStrategy();

        // Execute the selected algorithm
        boolean isPalindrome = strategy.check(input);

        // Display the expected output
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {
        // Create a stack to store characters.
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push each character of the input string onto the stack.
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack.
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false; // Exit early if mismatch found
            }
        }

        // If all characters matched
        return true;
    }
}