//25
/*import java.util.Scanner;
public class day7 {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
    
}
*/
//26
 /*import java.util.Scanner;
public class day7 {
    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int result = fibonacci(number);
        System.out.println("Fibonacci of " + number + " is: " + result);
    }
}  */
//27
/*import java.util.Scanner;
public class day7 {
    static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();
        int result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}  */

    //28
    /*import java.util.Scanner;
public class day7 {
    static void reverse(int number) {
        if (number < 10) {
            System.out.print(number);
        } else {
            System.out.print(number % 10);
            reverse(number / 10);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("Reversed number: ");
        reverse(number);
    }
} 
<<<<<<< HEAD
*/
=======
*/
>>>>>>> e4add868f8ce5556254d901d9c48c386808e13b7
