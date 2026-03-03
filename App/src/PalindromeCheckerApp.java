import java.util.LinkedList;
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "level";

        // Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the linked list
        for (char c : input.toCharArray()) {
            list.add(c); // Alternatively, list.addLast(c) does the same thing
        }

        // Flag to track palindrome state
        boolean isPalindrome = true;

        // Compare until only one or zero elements remain
        while (list.size() > 1) {
            // Remove from front and back of the LinkedList
            char first = list.removeFirst();
            char last = list.removeLast();

            // If they don't match, it's not a palindrome
            if (first != last) {
                isPalindrome = false;
                break; // Exit loop early
            }
        }

        // Display the expected output
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}