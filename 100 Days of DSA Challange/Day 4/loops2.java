
// a program that reads a set of integers, and then prints the sum of the even and odd integers
import java.util.Scanner;

public class loops2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sumOfEven = 0;
        int sumOfOdd = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                sumOfEven += num;
            } else {
                sumOfOdd += num;
            }
        }
        System.out.println("Sum of odd numbers: " + sumOfOdd);
        System.out.println("Sum of even numbers: " + sumOfEven);
        sc.close();
    }
}
