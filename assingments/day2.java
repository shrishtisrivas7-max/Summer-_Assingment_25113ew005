 //5
  /*import java.util.Scanner;
 public class day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;
        while (number > 0) {
           int Digit = number % 10;
            sum = sum + Digit;
            number = number/10;

            }
        System.out.println("The sum of the digits is: " + sum);
        sc.close();
        }

    
    }
        */

    //6
  /*import java.util.Scanner;
public class day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int reverse = 0;
        while (number > 0) {
            int Digit = number % 10;
            reverse = reverse * 10 + Digit;
            number = number/10;

            }
        System.out.println("The reverse of the number is: " + reverse);
        sc.close();
        }

    }    */

        //7
  /*import java.util.Scanner;
public class day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int product =1;
        while (number > 0) {
            int Digit = number % 10;
            product = product * Digit;
            number = number/10;

            }
        System.out.println("The product of the digits is: " + product);
        sc.close();
        }

    
    }
        */

        //8
    import java.util.Scanner;
public class day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int reverse = 0;
        while (number > 0) {
            int Digit = number % 10;
            reverse = reverse * 10 + Digit;
            number = number/10;

            }
        if (originalNumber == reverse) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
        sc.close();
        }

    
    }
        