public class MissingNum {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6};
        int n = arr.length+1;
        int sum=0;
        int nsum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        for(int i=1;i<=n;i++){
            nsum+=i;
        }
        int diff=nsum-sum;
        System.out.println("missing number is " +diff);
    }
}
