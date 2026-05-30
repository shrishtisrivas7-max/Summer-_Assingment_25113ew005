

//1
 
/*import java.util.Scanner;
public class day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum+i;
        }
        System.out.println("The result is: " + sum);
        sc.close();
    }
}  */

    //2
 /*import java.util.Scanner;
public class day1 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = sc.nextInt();
System.out.println("The multiplication table of " + number);
for (int i = 1; i <= 10; i++) {
    System.out.println(number + " * " + i + " = " + (number * i));
}
sc.close();

    }
}
   */ 
  //3

 /*import java.util.Scanner;
public class day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("The factorial of " + number + " is: " + factorial);
        sc.close();
    }
}  */
    

//4
/*import java.util.Scanner;
public class day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int count= 0;
        while(number!=0){
            number=number/10;
            count++;
        }
        System.out.println("The number of digits is: " + count);
        sc.close();
    }
}  */