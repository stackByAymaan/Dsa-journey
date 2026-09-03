// ^ ==================== LOOPS ====================

// * Loop is used to repeat a block of code multiple times until a certain condition is met.


// ^ ==================== WHILE LOOP ====================

// public class Loops {

//     public static void main(String[] args) {

//         int counter = 0;

//         while (counter < 100) {
//             System.out.println("Hello World");
//             counter++;
//         }

//     }

// }

// * while loop checks the condition first.
// * If the condition is true, the loop executes.
// * counter++ updates the value so the loop can eventually stop.


// ? PRINT NUMBERS FROM 1 TO 10 USING WHILE LOOP

// public class Loops {

//     public static void main(String[] args) {

//         int counter = 1;

//         while (counter <= 10) {
//             System.out.println(counter);
//             counter++;
//         }

//     }

// }


// ? PRINT NUMBERS FROM 1 TO n USING WHILE LOOP

// import java.util.Scanner;

// public class Loops {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int range = sc.nextInt();
//         int counter = 1;

//         while (counter <= range) {
//             System.out.println(counter);
//             counter++;
//         }

//         sc.close();

//     }

// }


// ? SUM OF FIRST n NATURAL NUMBERS

// import java.util.Scanner;

// public class Loops {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int sum = 0;
//         int i = 1;

//         while (i <= n) {
//             sum += i;   // sum = sum + i
//             i++;
//         }

//         System.out.println("The sum of first " + n + " natural numbers is: " + sum);

//         sc.close();

//     }

// }

// * Example: n = 5 → 1 + 2 + 3 + 4 + 5 = 15.


// ^ ==================== FOR LOOP ====================

// public class Loops {

//     public static void main(String[] args) {

//         for (int i = 1; i <= 10; i++) {
//             System.out.println("Hello World");
//         }

//     }

// }

// * for loop is useful when the number of iterations is known.
// * Syntax: for(initialization; condition; update)


// ? PRINT SQUARE PATTERN

// public class Loops {

//     public static void main(String[] args) {

//         for (int lines = 1; lines <= 4; lines++) {
//             System.out.println("****");
//         }

//     }

// }

// * Output:
// * ****
// * ****
// * ****
// * ****


// ? REVERSE OF A GIVEN NUMBER

// import java.util.Scanner;

// public class Loops {

//     public static void main(String[] args) {

//         int n = 10899;

//         while (n > 0) {

//             int lastDigit = n % 10;
//             System.out.print(lastDigit);

//             n = n / 10;
//         }

//     }

// }

// * n % 10 extracts the last digit.
// * n / 10 removes the last digit.
// * Example: 10899 → 99801.


// ^ ==================== DO-WHILE LOOP ====================

// import java.util.Scanner;

// public class Loops {

//     public static void main(String[] args) {

//         int counter = 1;

//         do {

//             System.out.println("Hello World");
//             counter++;

//         } while (counter <= 10);

//     }

// }

// * do-while executes the block first and checks the condition afterwards.
// * Therefore, it executes at least once.


// ^ ==================== BREAK STATEMENT ====================

// ? KEEP ENTERING NUMBERS UNTIL USER ENTERS A MULTIPLE OF 10

// import java.util.Scanner;

// public class Loops {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         while (true) {

//             System.out.print("Enter a number: ");
//             int n = sc.nextInt();

//             if (n % 10 == 0) {
//                 break;
//             }

//         }

//         sc.close();

//     }

// }

// * break immediately terminates the loop.
// * It is useful when a loop should stop before its normal condition becomes false.


// ^ ==================== CONTINUE STATEMENT ====================

// * continue skips the current iteration and moves to the next iteration of the loop.


// ? PRINT NUMBERS FROM 1 TO 10 EXCEPT MULTIPLES OF 3

// public class Loops {

//     public static void main(String[] args) {

//         for (int i = 1; i <= 10; i++) {

//             if (i % 3 == 0) {
//                 continue;
//             }

//             System.out.println(i);
//         }

//     }

// }

// * continue skips only the current iteration.
// * The loop itself does not terminate.


// ? CHECK IF A NUMBER IS PRIME OR NOT

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        }

        for (int i = 2; i <= n - 1; i++) {

            if (n % i == 0) {
                isPrime = false;
                break;
            }

        }

        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }

        sc.close();

    }

}

// * A prime number has exactly two factors: 1 and itself.
// * If n is divisible by any number between 2 and n - 1, it is not prime.