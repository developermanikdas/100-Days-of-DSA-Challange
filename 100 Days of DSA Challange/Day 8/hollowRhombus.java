public class hollowRhombus {
    public static void printRhombus(int n) {
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");

                }

            }
            System.out.println(" ");
        }
    }

    public static void main() {
        printRhombus(12);
    }
}
