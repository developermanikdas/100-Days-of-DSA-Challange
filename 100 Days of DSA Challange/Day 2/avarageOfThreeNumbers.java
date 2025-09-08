import java.util.*; 
public class avarageOfThreeNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the fist number: ");         
        float num1 = sc.nextFloat(); 
         System.out.print("Please enter the second number: ");         
        float num2 = sc.nextFloat(); 
         System.out.print("Please enter the third number: ");         
        float num3 = sc.nextFloat(); 

        float avarge = (num1+num2+num3)/3; 
        System.out.println("The avarage of the numbers is " + avarge); 
    }
}