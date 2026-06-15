import java.util.*;

public class Main {

    public static int[] createArray(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length: ");
        int length = sc.nextInt();

        if (length == 0) {
            System.out.println("Array length cannot be empty.");
            sc.close();
            return new int[0];
        }

        int[] arr = new int[length];


        for (int i = 0; i < length; i++) {
            System.out.print("Enter element: ");
            int num = sc.nextInt();
            arr[i] = num;
        }

        sc.close();
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static int findMax(int[] ar){
        int length = ar.length;

        if (length == 0) {
            System.out.println("Array length cannot be empty.");
            return 0;
        }

        int max = ar[0];

        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }

        System.out.println("Maximum is "+max);
        return max;
    }

    public static void main(String[] args) {
        findMax(createArray());        
    }
}