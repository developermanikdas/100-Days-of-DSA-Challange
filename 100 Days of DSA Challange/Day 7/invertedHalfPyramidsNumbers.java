public class InvertedHalfPyramidsNumbers {

    public static void printInvertedHalfPyramidWithNumbers(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(j+1);
            }
            System.out.println("");
        }
    }

    public static void main() {
        printInvertedHalfPyramidWithNumbers(5);
    }
}
