// ^ ==================== IF-ELSE ====================

// import java.util.*;
// public class javaCondSt {

//     public static void main(String[] args) {

//         int age = 22;

//         if (age >= 18) {
//             System.out.println("adult : drive, can vote, can drink");
//         } else {
//             System.out.println("not adult : cannot drive, cannot vote, cannot drink");
//         }

//     }

// }

// * if executes a block when the condition is true.
// * else executes when the if condition is false.


// ? PRINT WHICH NUMBER IS GREATER

// public class javaCondSt {

//     public static void main(String[] args) {

//         int A = 1;
//         int B = 3;

//         if (A > B) {
//             System.out.println("A is greater than B");
//         } else {
//             System.out.println("B is greater than A");
//         }

//     }

// }


// ? CHECK IF A NUMBER IS ODD OR EVEN

// public class javaCondSt {

//     public static void main(String[] args) {

//         int number = 7;

//         if (number % 2 == 0) {
//             System.out.println(number + " is even");
//         } else {
//             System.out.println(number + " is odd");
//         }

//     }

// }

// * % gives the remainder after division.
// * Even number → remainder 0 when divided by 2.
// * Odd number → remainder 1 when divided by 2.


// ^ ==================== ELSE-IF LADDER ====================

// public class javaCondSt {

//     public static void main(String[] args) {

//         int age = 12;

//         if (age >= 18) {
//             System.out.println("adult");
//         } else if (age >= 13 && age < 18) {
//             System.out.println("teenager");
//         } else {
//             System.out.println("child");
//         }

//     }

// }

// * else-if is used when multiple conditions need to be checked.
// * Conditions are checked from top to bottom.
// * The first true condition gets executed.


// ^ ==================== TERNARY OPERATOR ====================

// public class javaCondSt {

//     public static void main(String[] args) {

//         int number = 4;

//         String type = (number % 2 == 0) ? "even" : "odd";

//         System.out.println(type);

//     }

// }

// * Ternary operator is a short form of if-else.
// * Syntax: condition ? true-value : false-value


// ? CHECK IF A STUDENT WILL PASS OR FAIL

// public class javaCondSt {

//     public static void main(String[] args) {

//         int marks = 63;

//         String type = (marks >= 33) ? "pass" : "fail";

//         System.out.println(type);

//     }

// }


// ^ ==================== SWITCH STATEMENT ====================

// public class javaCondSt {

//     public static void main(String[] args) {

//         int number = 2;

//         switch (number) {

//             case 1:
//                 System.out.println("samosa");
//                 break;

//             case 2:
//                 System.out.println("burger");
//                 break;

//             case 3:
//                 System.out.println("mango shake");
//                 break;

//             default:
//                 System.out.println("We wake up");
//         }

//     }

// }

// * switch compares one value with different fixed cases.
// * break stops execution after a matching case.
// * default executes when no case matches.


// ~ SWITCH STATEMENT USING CHARACTER

public class javaCondSt {

    public static void main(String[] args) {

        char ch = 'a';

        switch (ch) {

            case 'b':
                System.out.println("samosa");
                break;

            case 'a':
                System.out.println("burger");
                break;

            case 'd':
                System.out.println("mango shake");
                break;

            default:
                System.out.println("We wake up");
        }

    }

}