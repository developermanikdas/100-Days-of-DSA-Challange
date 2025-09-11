public class BinToDecimal {

    public static void b2d(int binary){
        int decimal = 0; 
        int i = 0;
        while(binary > 0){
            int lastDigit = binary%10;
            lastDigit = (int)(Math.pow(2,i)) * (lastDigit);
            decimal+=lastDigit;
            binary/=10; 
            i++;
        }
        System.out.println(decimal);
    }
    public static void main(String args[]){
        b2d(10101101); 
    }
}
