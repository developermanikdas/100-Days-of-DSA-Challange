public class ZeroOneTriangle {
    public static void zeroOneTriangle(int n) {
        boolean num = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                // if (num == true) {
                // System.out.print("0");
                // } else {
                // System.out.print("1");
                // }
                // num = !num;

                if ((i + j) % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println("");
        }
    }

    public static void main() {
        zeroOneTriangle(4);
    }
}
