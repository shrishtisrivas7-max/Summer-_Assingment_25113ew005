/*import java.util.Scanner;
public class day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();
        int position = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            System.out.println("Element found at position: " + position);
        } else {
            System.out.println("Element not found in the array.");
        }
        sc.close();
    }
}*/
//54
/*import java.util.Scanner;
public class day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to find frequency: ");
        int target = sc.nextInt();
        int frequency = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                frequency++;
            }
        }
        System.out.println("Frequency of " + target + " is: " + frequency);
        sc.close(); 
    }
}*/

//55
/*import java.util.Scanner;
public class day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest element in the array is: " + largest);
        System.out.println("Second largest element in the array is: " + secondLargest);
        sc.close();
    }
}*/

//56
/*import java.util.Scanner;
public class day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Duplicate elements in the array are: ");
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                continue; // Skip printing duplicates multiple times
            }
            for (int k = i + 1; k < n; k++) {
                if (arr[i] == arr[k]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
        sc.close();
    }
}*/