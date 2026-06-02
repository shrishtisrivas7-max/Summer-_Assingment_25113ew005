//21

/* 
import java.util.Scanner;
public class day6 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int number = sc.nextInt();
        String binary = "";
        while (number > 0) {
            int remainder = number % 2;
            binary = remainder + binary;
            number = number / 2;
        }   
        System.out.println("Binary representation: " + binary);
    }
}  */

    //22
    /*import java.util.Scanner;
public class day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
    int number = sc.nextInt();
        
        int decimal = 0;
        int power = 0;
        while (number > 0) {
            int digit = number % 10;
            decimal += digit * Math.pow(2, power);
            power++;
            number = number / 10;
        }
        System.out.println("Decimal representation: " + decimal);
    }  */

        //23
      /*   import java.util.Scanner;
public class day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int count = 0;
        while (number > 0) {
            if ((number & 1) == 1) {
                count++;
            }
            number = number >> 1;
        }
        System.out.println("Number of 1s in binary representation: " + count);
    }
}  */

    //24
   /* import java.util.Scanner;
public class day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        long result = 1;
        for (int i = 1; i <= y; i++) {
            result *= x;
        }
        System.out.println(x + " raised to the power of " + y + " is: " + result);
    }
}   
 */
