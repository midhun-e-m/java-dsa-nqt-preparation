import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EofPrint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=1;
        while(sc.hasNext()){
            String in =sc.nextLine();
            System.out.println(n +" "+in);
            ++n;
        }
    }
}