import java.util.Stack;
import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.println("Enter the brackets:");
        String str = s.nextLine();

        boolean isBalanced = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Opening brackets
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            }

            // Closing brackets
            else if (ch == '}' || ch == ']' || ch == ')') {

                if (stack.isEmpty()) {
                    isBalanced = false;
                    break;
                }

                char top = stack.peek();

                if ((ch == '}' && top == '{') ||
                        (ch == ']' && top == '[') ||
                        (ch == ')' && top == '(')) {

                    stack.pop();
                } else {
                    isBalanced = false;
                    break;
                }
            }
        }

        if (isBalanced && stack.isEmpty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Unbalanced");
        }
    }
}