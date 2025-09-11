public class DecimalToBinary {

    public static int d2b(int num) {
        int binary = 0;
        int i = 0;
        while (num > 0) {
            int remainder = num % 2;
            num/=2;
            binary = binary + ((int) Math.pow(10, i) * remainder);
            i++;
        }
        return binary;
    }
 
    public static void main(String args[]) {
        System.out.println(d2b(1));
    }
}
