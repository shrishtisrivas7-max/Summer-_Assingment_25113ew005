//37
/*

public class day10 {
    public static void main(String[] args) {
        int number = 5;
        for(int i = 1; i <= number; i++) {
            for(int j = 1; j <= number-i ; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2*i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
} */

    //38
   /*  public class day10 {
        public static void main(String[] args) {
            int number = 5;
            for(int i = number; i >= 1; i--) {
                for(int j = 1; j <= number - i; j++) {
                    System.out.print(" ");
                }
                for(int k = 1; k <= (2*i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    } */

        //39
       /*
       public class day10 {
            public static void main(String[] args) {
                int number = 5;
                for(int i = 1; i <= number; i++) {
                    for(int j = 1; j <= number - i; j++) {
                        System.out.print(" ");
                    }
                    for(int j = 1;j<=i;j++) {
                        System.out.print(j);
                    }
                    for(int j = i-1; j >= 1; j--) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
            }
        }
        */


        //40
     /*    public class day10 {
            public static void main(String[] args) {
                int number = 5;
                for(int i = 1; i <= number; i++) {
                    for(int j = 1; j <= number - i; j++) {
                        System.out.print(" ");
                    }
                    for(int j = 1; j <= number-i; j++) {
                        System.out.print("");
                    }
                    for(char ch = 'A'; ch < 'A' + i; ch++) {
                        System.out.print(ch);
                    }
                    for(char ch = (char)('A' + i - 2); ch >= 'A'; ch--) {
                        System.out.print(ch);
                    }
                    System.out.println();
                }
            }
        }
*/