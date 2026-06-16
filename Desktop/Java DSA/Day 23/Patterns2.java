import java.util.*;

public class Patterns2 {

    public static void hollowRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || j == 0 || i == height - 1 || j == width - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void halfPyramid(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {

                if (j >= num - (i + 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // have easier implementation (this is intensional to block spaces with "_")
    public static void invertedNumberPyreamid(int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {

                if (j >= width - i) {
                    System.out.print(" _");
                } else {
                    System.out.print(j + 1 + " ");
                }
            }
            System.out.println();
        }
    }

    // have easier implementation (this is intensional to block spaces with "_")
    public static void numberPyreamid(int width) {
        int num = 1;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {

                if (j > i) {
                    System.out.print("* ");
                } else {
                    System.out.print(num + " ");
                    num++;
                }
            }
            System.out.println();
        }
    }

    public static void zeroOneTriangle(int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j <= i; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void butterflyPattern(int width) {
        for (int i = 0; i < width; i++) {

            // stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            // spaces
            for (int j = 0; j < 2 * (width - i - 1); j++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = width; i > 1; i--) {

            // stars
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            // spaces
            for (int j = 0; j < 2 * (width - i + 1); j++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void rhoumbus(int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < width; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowRoumbus(int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width - i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < width; j++) {
                if (i == 0 || j == 0 || i == width - 1 || j == width - 1) {
                    System.out.print("* ");
                }else{
                   System.out.print("  "); 
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Width: ");
        // int width = sc.nextInt();
        // System.out.print("Enter Height: ");
        // int height = sc.nextInt();

        // hollowRectangle(width, height);
        // halfPyramid(width);
        // invertedNumberPyreamid(width);
        // numberPyreamid(width);
        // zeroOneTriangle(width);
        // butterflyPattern(width);
        // rhoumbus(width);
        // hollowRoumbus(width);

        sc.close();
    }
}
