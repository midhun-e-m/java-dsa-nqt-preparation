public class EvenOddCount {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6, 7};
        int Ecount=0;
        int Ocount=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                Ecount++;
            }
            else{
                Ocount++;
            }
        }
        System.out.println("number of even numbers:"+Ecount);
        System.out.println("number of odd numbers:"+Ocount);
    }
}
