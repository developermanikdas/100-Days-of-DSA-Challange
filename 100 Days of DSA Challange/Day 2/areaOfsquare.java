import java.util.Scanner;

public class areaOfsquare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the side Length: ");
        double side = sc.nextDouble();
        double area = side*side; 
        System.out.println("The area is " + area);
    }
}
