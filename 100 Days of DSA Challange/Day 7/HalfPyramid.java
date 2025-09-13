public class HalfPyramid {
    public static void printHalfPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        printHalfPyramid(4);
    }
}
