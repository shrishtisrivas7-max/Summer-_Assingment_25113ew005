//13
/* 
import java.util.Scanner;

public class Day4 {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter  number of terms: ");
    int number = sc.nextInt();
    int a = 0, b = 1;
    System.out.println("Fibonacci series up to " + number + " terms:"); 
    for (int i = 1; i <= number; i++) {
        System.out.print(a + " ");
        int next = a + b;
        a = b;
        b = next;
    }


}

} */

//14

 /*import java.util.Scanner;
public class Day4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        if(n==1) {
            System.out.println("Nth term of Fibonacci series is: " + a);
        } else if (n==2) {
            System.out.println("Nth term of Fibonacci series is: " + b);
        } else {
            for (int i = 3; i <= n; i++) {
                int c= a + b;
                a = b;
                b = c;
            }
            System.out.println("Nth term of Fibonacci series is: " + b);
        } 
    }
}  */


    //15

   /*  import java.util.Scanner;
public class Day4 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int temp = number;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }   
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        sc.close();
    }
}*/

//16

  /* import java.util.Scanner;
public class Day4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");  
        int end = sc.nextInt();
        System.out.println("Armstrong numbers between " + start + " and " + end +   " are: ");
        for (int number = start; number <= end; number++) {
            int temp = number;
            int sum = 0;
            while (temp != 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }   
            if (sum == number) {
                System.out.println(number);
            }
        }
        sc.close();
    }   
}   */

        