//9
/*import java.util.Scanner;
public class day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }   
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        sc.close();
    }
}    */

//10
 /*import java.util.Scanner;
public class day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.println("Enter the ending number: ");
        int end = sc.nextInt();
        System.out.println(" prime numbers are : ");
        for( int number = start ; number <= end; number++) {
            boolean isPrime = true;
            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }   
            if (isPrime) {
                System.out.println(number);
            }
        }
    }
}  */

    // 11

   /*  import java.util.Scanner;
public class day3 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
         while (num2!= 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        System.out.println("GCD is: " + num1);
        sc.close();
    }
}  */

    //12
    import java.util.Scanner;
public class day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
         int a = num1;
         int b = num2;
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
        System.out.println("LCM is: " + a);
        sc.close();
    }
}