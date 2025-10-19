//Checking for a Balanced Bracket Sequence
import java.util.Stack;
import java.util.Scanner;

 class Problem36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with brackets: ");
        String input = scanner.nextLine();
        if (isBalanced(input)) {
            System.out.println("The bracket sequence is balanced.");
        } else {
            System.out.println("The bracket sequence is not balanced.");
        }
    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char open = stack.pop();
                if (!isMatchingPair(open, ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}