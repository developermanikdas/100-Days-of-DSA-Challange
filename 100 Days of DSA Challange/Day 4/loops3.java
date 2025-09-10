import java.util.Scanner;

public class loops3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to get the factorial: ");
        int num = sc.nextInt();
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial*i;
        }
        System.out.print("The factorial: " + factorial);

        sc.close();
    }
}