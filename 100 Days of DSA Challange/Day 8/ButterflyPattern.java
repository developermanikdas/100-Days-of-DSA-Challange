public class ButterflyPattern {

    public static void printButterfly(int n) {

        for (int i = 0; i < n; i++) {
            // star
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int j = 0; j < (2 * (n - i - 1)); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
      
        for (int i = n; i > 0; i--) {
            // star
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int j = 0; j < (2 * (n - i)); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        printButterfly(4);
    }
}