public class Diamond {

    public static void printDiamond(int n) {

        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (i + 1) - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = n; i > 0; i--) {
            // spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        printDiamond(8);
    }
}
