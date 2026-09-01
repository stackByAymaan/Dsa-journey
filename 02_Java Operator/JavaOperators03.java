// ^ ==================== ARITHMETIC OPERATORS ====================

// public class JavaOperators03 {

//     public static void main(String args[]) {

//         int A = 10;
//         int B = 20;

//         System.out.println("Add = " + (A + B));
//         System.out.println("Subtract = " + (A - B));

//     }

// }

// * Arithmetic operators are used to perform mathematical operations.
// * + Addition
// * - Subtraction
// * * Multiplication
// * / Division
// * % Modulus (remainder)


// ~ ==================== UNARY OPERATORS ====================

// public class JavaOperators03 {

//     public static void main(String args[]) {

//         int a = 10;
//         int b = ++a;    // Pre-increment

//         System.out.println(a);
//         System.out.println(b);

//         int c = 10;
//         int d = c++;    // Post-increment

//         System.out.println(c);
//         System.out.println(d);

//         int e = 10;
//         int f = --e;    // Pre-decrement

//         System.out.println(e);
//         System.out.println(f);

//         int g = 10;
//         int h = g--;    // Post-decrement

//         System.out.println(g);
//         System.out.println(h);

//     }

// }

// * Pre-increment: First increase the value, then use it.
// * Post-increment: First use the value, then increase it.
// * Pre-decrement: First decrease the value, then use it.
// * Post-decrement: First use the value, then decrease it.


// ~ ==================== RELATIONAL OPERATORS ====================

// public class JavaOperators03 {

//     public static void main(String args[]) {

//         int A = 10;
//         int B = 20;

//         System.out.println(A > B);   // Greater than
//         System.out.println(A < B);   // Less than

//     }

// }

// * Relational operators compare two values and return true or false.
// * >  Greater than
// * <  Less than
// * >= Greater than or equal to
// * <= Less than or equal to
// * == Equal to
// * != Not equal to


// ~ ==================== LOGICAL OPERATORS ====================

// public class JavaOperators03 {

//     public static void main(String args[]) {

//         int A = 10;
//         int B = 20;

//         System.out.println((A < B) && (A == 10));   // Logical AND
//         System.out.println((A < B) || (B == 10));   // Logical OR
//         System.out.println(!(A < B));               // Logical NOT

//     }

// }

// * && (AND) → true only when both conditions are true.
// * || (OR)  → true when at least one condition is true.
// * !  (NOT) → reverses true to false and false to true.


// ~ ==================== ASSIGNMENT OPERATORS ====================

public class JavaOperators03 {

    public static void main(String args[]) {

        int A = 10;

        A += 5;     // A = A + 5
        System.out.println(A);

        A -= 3;     // A = A - 3
        System.out.println(A);

        A *= 2;     // A = A * 2
        System.out.println(A);

        A /= 4;     // A = A / 4
        System.out.println(A);

    }

}

// * Compound assignment operators provide a shorter way to update a variable.
// * += → A = A + value
// * -= → A = A - value
// * *= → A = A * value
// * /= → A = A / value


// ? OPERATOR PRECEDENCE

// * Operator precedence determines which operator is evaluated first
// * when an expression contains multiple operators.
// * Parentheses () have the highest priority and can be used to
// * control the order of evaluation.