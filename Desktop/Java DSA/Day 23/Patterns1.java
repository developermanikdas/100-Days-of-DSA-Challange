import java.util.*;

public class Patterns1 {

    public static void halfPyramid(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void invertedHalfPyramid(int num) {
        for (int i = num; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void halfNumberPyramid(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println("");
        }
    }

    public static void halfCharacterPyramid(int num) {
        char ch = 'A';
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Lenght: ");
        int num = sc.nextInt();

        halfPyramid(num);
        invertedHalfPyramid(num);
        halfNumberPyramid(num);
        halfCharacterPyramid(num);

        sc.close();
    }
}
