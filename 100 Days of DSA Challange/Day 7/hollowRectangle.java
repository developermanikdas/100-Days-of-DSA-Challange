import java.util.Scanner;

public class hollowRectangle {

    public static void printStar(int length, int height) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextInt();
        System.out.print("Enter height: ");
        height = sc.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                if (i == 0 || i == (height - 1) || j == 0 || j == (length - 1)) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");

                }
            }
            System.out.println("");
        }
        sc.close();
    }

    public static void main(String args[]) {
        printStar(10, 4);
    }
}