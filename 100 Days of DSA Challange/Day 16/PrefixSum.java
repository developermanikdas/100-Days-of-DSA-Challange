public class PrefixSum {

    public static int maxSum(int arr[]) {
        int n = arr.length;

        int prefix[] = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int curSum = prefix[0];
        int maxSum = Integer.MIN_VALUE;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                curSum = (start == 0) ? prefix[end] : prefix[end] - prefix[start - 1];
                maxSum = Math.max(maxSum, curSum);
            }
        }
        return maxSum;
    }

    public static void main(String args[]) {
        int arr[] = { -1, 2, 3, 4, -5 };
        System.out.println(maxSum(arr));
    }

}
