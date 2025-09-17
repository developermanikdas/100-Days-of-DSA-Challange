public class Pairs {

    public static void makePairs(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            // for (int j = i+1; j < arr.length - i; j++) {
            // System.out.println(arr[i] + "," + arr[j]);
            // }
            for (int j = i+1; j < arr.length; j++) {
                System.out.print(arr[i] + "," + arr[j]+ "  ");
            }
        }
    }

    public static void main() {
        int arr[] = { 1, 2, 3, 4, 5 };
        makePairs(arr);
    }
}
