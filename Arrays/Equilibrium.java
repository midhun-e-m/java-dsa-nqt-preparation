public class Equilibrium {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 2, 2};

        int totalSum = 0;

        // Step 1: Calculate total sum of array
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;

        // Step 2: Traverse array and check equilibrium
        for (int i = 0; i < arr.length; i++) {

            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                System.out.println("Equilibrium index is: " + i);
                return; // stop after first equilibrium found
            }

            leftSum += arr[i];
        }

        System.out.println("No equilibrium index found.");
    }
}