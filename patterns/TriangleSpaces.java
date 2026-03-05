import java.util.*;
public class TriangleSpaces {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no of lines:");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            for(int k=i;k<n;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
