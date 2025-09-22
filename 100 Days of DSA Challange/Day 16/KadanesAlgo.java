public class KadanesAlgo {

    public static int kadaneAlgo(int[] arr) {
        int n = arr.length;
        int curSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < n; i++) {
            curSum = Math.max(arr[i], curSum + arr[i]);
            maxSum = Math.max(maxSum, curSum); 
        }
        return maxSum; 
    }

    public static void main(String args[]) {
        int arr[] = { -1, 2, -3, -4 };
        System.out.println(kadaneAlgo(arr));
    }
}
