import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // Define the input string to validate
        String input = "civic";

        // Create a Queue to store characters in FIFO order
        Queue<Character> queue = new LinkedList<>();

        // Create a Stack to store characters in LIFO order
        Stack<Character> stack = new Stack<>();

        // Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare characters until the queue becomes empty
        while (!queue.isEmpty()) {
            // Remove from front of queue (FIFO) and top of stack (LIFO)
            char queueChar = queue.remove();
            char stackChar = stack.pop();

            // If they don't match, it's not a palindrome
            if (queueChar != stackChar) {
                isPalindrome = false;
                break; // Exit loop early
            }
        }

        // Display the expected output
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}