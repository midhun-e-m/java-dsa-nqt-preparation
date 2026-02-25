public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};
        int large=Integer.MIN_VALUE;
        int slarge=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(large<arr[i]){
                slarge=large;
                large=arr[i];
            } else if (slarge<arr[i] && arr[i]<large) {
                slarge=arr[i];
            }
        }
        System.out.printf("the largest is %d and second largest is %d",large,slarge);
    }
}
