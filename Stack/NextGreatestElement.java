import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;
public class NextGreatestElement {
    public static void main(String[] args) {
        int[] arr={4,5,2,10};
        System.out.println(Arrays.toString(nextGreaterElement(arr)));
    }
    public static int[] nextGreaterElement(int[] arr){
        Stack<Integer> s = new Stack<>();
        int[] result = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.empty() && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.empty()){
                result[i]=-1;
            }
            else{
                result[i]=s.peek();
            }
            s.push(arr[i]);
        }
        return result;
    }
}
