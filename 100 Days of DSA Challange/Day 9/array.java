import java.util.Scanner;

public class array {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int arr2[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter any number: ");

            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arr2[i]);
        }
    }
}