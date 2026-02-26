import java.util.Scanner;
import java.util.Stack;
public class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();
        System.out.println("Enter a string:");
        String str=s.nextLine();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            stack.push(String.valueOf(c));
        }
        for(int i=0;i<str.length();i++){
            System.out.print(stack.pop());
        }
    }
}
