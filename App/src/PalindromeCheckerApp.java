public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // Define the input string
        String input = "level";

        // Instantiate the strategy algorithm (Using StackStrategy from UC12 as an example)
        PalindromeStrategy strategy = new StackStrategy();

        // 1. Capture execution start time in nanoseconds
        long startTime = System.nanoTime();

        // 2. Execute the algorithm
        boolean isPalindrome = strategy.check(input);

        // 3. Capture execution end time in nanoseconds
        long endTime = System.nanoTime();

        // 4. Calculate total execution duration
        long executionTime = endTime - startTime;

        // Display the benchmarking results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}