public class MaxSubarraySum {
    public static void printSubarray(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int temp = 0;
                for (int k = i; k <= j; k++) {
                    temp += arr[k];
                    System.out.print(arr[k] + " ");
                }
                max = Math.max(max, temp);
                System.out.println(" Addition is: " + temp);
            }
        }
        System.out.println("Max is: " + max);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 16 };
        printSubarray(arr);
    }
}
