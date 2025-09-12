public class Function3 {

    public static boolean palindrom(int num) {
        int pow = 0;
        int newNum = 0;
        int curNum = num;
        while (curNum > 0) {
            int lastDigit = curNum % 10;
            newNum = newNum * 10 + lastDigit; // <-- key fix
            curNum /= 10;
            pow++;
        }

        if (num == newNum) {
            return true;
        } else {
            return false;
        }
    }

    public static void printPalindrom() {
        for (int i = 10; i < 100; i++) {
            if (palindrom(i) == true) {
                System.out.println(i);
            }
        }
    }

    public static void main(String args[]) {
        printPalindrom();
    }
}
