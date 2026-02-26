import java.math.BigInteger;
import java.util.Scanner;
public class DataTypes{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for(int i = 0 ; i < 5 ; i++){
            String angka = input.next();
            BigInteger n = new BigInteger(angka);
            
            boolean bisa = false;
            System.out.println(angka + "can be fitted in:");
            
            try {
                
            long val = n.longValueExact();
            
            if(val >= Byte.MIN_VALUE && val <= Byte.MAX_VALUE)
            System.out.println("* Byte");

            if(val >= Short.MIN_VALUE && val <= Short.MAX_VALUE)
            System.out.println("* Short");

            if(val >= Integer.MIN_VALUE && val <= Integer.MAX_VALUE)
            System.out.println("* Int");

            if(val >= Long.MIN_VALUE && val <= Long.MAX_VALUE);
            System.out.println("* Long");

            bisa = true;


            }catch(Exception e){

            }
            if (!bisa) {
    System.out.println(angka + " can't be fitted anywhere.");
        }
       
    }
}
}