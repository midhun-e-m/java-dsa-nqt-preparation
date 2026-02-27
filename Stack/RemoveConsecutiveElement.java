import java.util.Stack;
import java.util.Scanner;
public class RemoveConsecutiveElement {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the String:");
        String str=s.nextLine();
        for(int i=0;i<str.length();i++){
            if(stack.empty()){
                stack.push(str.charAt(i));
            }
            else if(stack.peek()==str.charAt(i)){
                continue;
            }
            else{
                stack.push(str.charAt(i));
            }
        }
        StringBuilder result = new StringBuilder();

        for(char c : stack){
            result.append(c);
        }

        System.out.println(result);
        s.close();
    }
}
