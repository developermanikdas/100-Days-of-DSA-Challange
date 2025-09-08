import java.util.Scanner;

public class totalBill {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("I see, you've three stuff in your bag. Let me make a bill for you.");
        System.out.println("The pen is worth: ");
        double pen = sc.nextDouble();
        System.out.println("The pencil is worth: ");
        double pencil = sc.nextDouble();
        System.out.println("The book is worth: ");
        double book = sc.nextDouble();
        System.out.println("And a little GST (18%), and your bill is: " + (pen+pencil+book));  // without bracket, it wont work cause concatination happens before sum
    }
}
