import java.util.Scanner;
import java.util.regex.*;

public class PatternValidity
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            boolean check = true;
            String pattern = in.nextLine();
            //Write your code
            try{
                Pattern.compile(pattern);
            }
            catch(Exception e){
                check = false;
            }
            if(check){
                System.out.println("Valid");
            }
            else{
                System.out.println("Invalid");
            }
            testCases--;
        }
        in.close();
    }
}



