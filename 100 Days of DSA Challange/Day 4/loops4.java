import java.util.Scanner;

public class loops4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.print(num + "  ");
        }
        System.out.println("");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "  ");
        }
        System.out.println("");

        for (int i = 1; i <= 10; i++) {
            System.out.print(num * i + " ");
        }
        sc.close();
    }
}
