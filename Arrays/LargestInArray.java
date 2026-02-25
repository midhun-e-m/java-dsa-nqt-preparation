public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        int large=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(large<arr[i]){
                large=arr[i];
            }
        }
        System.out.println("largest is "+large);
    }
}
