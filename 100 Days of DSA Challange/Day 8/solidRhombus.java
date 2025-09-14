public class solidRhombus {
    public static void printRhombus(int n) {
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public static void main() {
        printRhombus(12);
    }
}
