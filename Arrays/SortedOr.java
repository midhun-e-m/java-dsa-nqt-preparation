public class SortedOr {
    public static void main(String[] args) {
        int[] arr={3,2,1,4,5};
        int n= arr.length;
        boolean asc=true;
        for(int i=0; i<n;i++) {
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    asc=false;
                    break;
                }
            }
        }
        if(asc){
            System.out.println("asc");
        }
    }
}
