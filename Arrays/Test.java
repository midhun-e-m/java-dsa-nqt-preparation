import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the limit:");
        int n = s.nextInt();
        int[] arr =  new int[n];
        System.out.println("Enter the elements into the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        int tmax=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(max<arr[i]){
                smax=max;
                max=arr[i];
            } else if (smax<arr[i] && arr[i]<max) {
                tmax=smax;
                smax=arr[i];
            }
            else if(tmax<arr[i]&& arr[i]<smax){
                tmax=arr[i];
            }
        }
        System.out.println("the third largest is " +tmax);
    }
}
