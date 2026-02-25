public class DuplicateRemoval {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 5, 6};
        int repeated = 0;
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                repeated = arr[i];
                count++;
            }
            for (int j = arr.length; i >0; j--) {
                if (arr[i] == repeated) {
                    arr[i] = arr[i + 1];
                }
            }

            System.out.println(repeated + " and " + count);
        }
    }
}
