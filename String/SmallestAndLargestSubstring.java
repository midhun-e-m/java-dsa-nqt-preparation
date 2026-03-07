import java.util.Scanner;
public class SmallestAndLargestSubstring {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int n=s.length();
        int subCount= n - k + 1;
        String[] subs = new String[subCount];
        for(int i=0;i<=n-k;i++){
            subs[i]=s.substring(i,i+k);
        }
        smallest=subs[0];
        largest=subs[0];
        for(int i=0;i<=n-k;i++)
        {
            if((subs[i].compareTo(smallest))<0)
            {
                smallest=subs[i];
            }
            if((subs[i].compareTo(largest))>0)
            {
                largest=subs[i];
            }
        }
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}